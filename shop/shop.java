package SHOP;

import java.util.HashMap;

public class shop {

    String name;
    String addres;
    int money = 0;
    HashMap<String,Integer> kolichestvaZaBroi;
    HashMap<String,Integer> kolichestvaZaKilogram;
    HashMap<String,Integer> cenaZaBroi;
    HashMap<String,Integer> cenaZaKilogram;


    public shop(String name, String addres) {
        this.name = name;
        this.addres = addres;
        kolichestvaZaBroi = new HashMap<>();
        kolichestvaZaKilogram = new HashMap<>();
        cenaZaBroi = new HashMap<>();
        cenaZaKilogram = new HashMap<>();


        kolichestvaZaKilogram.put("meat",20);
        kolichestvaZaKilogram.put("chees",20);
        kolichestvaZaKilogram.put("fish",20);
        cenaZaKilogram.put("meat",5);
        cenaZaKilogram.put("chees",4);
        cenaZaKilogram.put("fish",8);
        kolichestvaZaBroi.put("beer",50);
        kolichestvaZaBroi.put("book",50);
        kolichestvaZaBroi.put("chair",50);
        cenaZaBroi.put("beer",2);
        cenaZaBroi.put("book",10);
        cenaZaBroi.put("chair",28);


    }

    @Override
    public String toString() {
        return super.toString();
    }
}
