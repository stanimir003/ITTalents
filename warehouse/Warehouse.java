package WorkInWarehouse;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {

    HashMap<String, Integer> Fruits;
    HashMap<String, Integer> Vegetable;
    HashMap<String, Integer> Meats;
    Provider provider;
    int dostavka;
    int oldValue;

    public Warehouse() {

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
                oldValue =fruits.getValue();
               dostavka = provider.Dostavqne();
                fruits.setValue(oldValue+dostavka);
            }
        }
        for (Map.Entry<String, Integer> vegetable : Vegetable.entrySet()) {
            if (vegetable.getValue() < 15) {
                oldValue =vegetable.getValue();
                dostavka = provider.Dostavqne();
                vegetable.setValue(oldValue+dostavka);
            }
            for (Map.Entry<String, Integer> meeat : Meats.entrySet()) {
                if (meeat.getValue() < 15) {
                    oldValue =meeat.getValue();
                    dostavka = provider.Dostavqne();
                    meeat.setValue(oldValue+dostavka);
                }
            }

        }

    }
    public  int vzemaneNaProdukt(String name) {
         for (Map.Entry<String, Integer> fruits : Fruits.entrySet()) {
             if (fruits.getKey().equals(name)) {
                 if (fruits.getValue() >= 15) {
                     fruits.setValue(fruits.getValue() - 5);
                 }
                 else {
                     Dostavka();
                     fruits.setValue(fruits.getValue() - 5);
                 }
             }
         }
         for (Map.Entry<String, Integer> vegetable : Vegetable.entrySet()) {
             if (vegetable.getKey().equals(name)) {
                 if (vegetable.getValue() >= 15) {
                     vegetable.setValue(vegetable.getValue() - 5);
                 }
                 else {
                     Dostavka();
                     vegetable.setValue(vegetable.getValue() - 5);
                 }
             }
         }
         for (Map.Entry<String, Integer> meeat : Meats.entrySet()) {
             if (meeat.getKey().equals(name)) {
                 if (meeat.getValue() >= 15) {
                     meeat.setValue(meeat.getValue() - 5);
                 }
                 else {
                     Dostavka();
                     meeat.setValue(meeat.getValue() - 5);
                 }
             }
         }
         return 5;
    }



    @Override
    public String toString() {
        return super.toString();
    }
}
