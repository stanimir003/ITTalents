package WorkInWarehouse;

import java.util.HashMap;
import java.util.Map;

public class Shop {

    HashMap<String, Integer> Fruits;
    HashMap<String, Integer> Vegetable;
    HashMap<String, Integer> Meats;
    Warehouse warehouse;
    int  oldValue;
    int dostavka;
    Provider provider;

    public Shop() {

        Fruits = new HashMap<>();
        Fruits.put("Banana", 15);
        Fruits.put("Orange", 15);
        Fruits.put("Apple", 15);
        Vegetable = new HashMap<>();
        Vegetable.put("Potato", 15);
        Vegetable.put("Eggplant", 15);
        Vegetable.put("Cucumber", 15);
        Meats = new HashMap<>();
        Meats.put("Pork", 15);
        Meats.put("Beef", 15);
        Meats.put("Chicken", 15);

    }
    void ShowProducts() {
        System.out.println("--------FRUITS--------");
        for (Map.Entry<String, Integer> fruits : Fruits.entrySet()) {
            System.out.println(fruits.getKey() + "  " + fruits.getValue() + " бройки");
        }
        System.out.println("--------VEGETABLE--------");
        for (Map.Entry<String, Integer> vegetable : Vegetable.entrySet()) {
            System.out.println(vegetable.getKey() + "  " + vegetable.getValue() + " бройки");
        }
        System.out.println("--------MEAT--------");
        for (Map.Entry<String, Integer> meeat : Meats.entrySet()) {
            System.out.println(meeat.getKey() + "  " + meeat.getValue() + " бройки");
        }
    }
    public  void Dostavka() {
        for (Map.Entry<String, Integer> fruits : Fruits.entrySet()) {
            if (fruits.getValue() < 15) {
                oldValue = fruits.getValue();
                dostavka = 15;
                fruits.setValue(oldValue + dostavka);
            }
        }
        for (Map.Entry<String, Integer> vegetable : Vegetable.entrySet()) {
            if (vegetable.getValue() < 15) {
                oldValue = vegetable.getValue();
                dostavka =15;
                vegetable.setValue(oldValue + dostavka);
            }
            for (Map.Entry<String, Integer> meeat : Meats.entrySet()) {
                if (meeat.getValue() < 15) {
                    oldValue = meeat.getValue();
                    dostavka = 15;
                    meeat.setValue(oldValue + dostavka);
                }
            }

        }
    }
    void buy(String name,int kolochestvo){
        for (Map.Entry<String, Integer> fruits : Fruits.entrySet()) {
            if (fruits.getKey().equals(name)) {
                if (fruits.getValue() >= 15) {
                    fruits.setValue(fruits.getValue() - kolochestvo);
                }
                else {
                    Dostavka();
                    fruits.setValue(fruits.getValue() - kolochestvo);
                }
            }
        }
        for (Map.Entry<String, Integer> vegetable : Vegetable.entrySet()) {
            if (vegetable.getKey().equals(name)) {
                if (vegetable.getValue() >= 15) {
                    vegetable.setValue(vegetable.getValue() - kolochestvo);
                }
                else {
                    Dostavka();
                    vegetable.setValue(vegetable.getValue() - kolochestvo);
                }
            }
        }
        for (Map.Entry<String, Integer> meeat : Meats.entrySet()) {
            if (meeat.getKey().equals(name)) {
                if (meeat.getValue() >= 15) {
                    meeat.setValue(meeat.getValue() - kolochestvo);
                }
                else {
                        Dostavka();
                    meeat.setValue(meeat.getValue() - kolochestvo);
                }
            }
        }
    }
}
