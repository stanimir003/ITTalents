package SHOP;

import java.util.HashMap;
import java.util.Map;

public class Client {

    shop shop;
    int myMoney;
    HashMap<String,Integer> kolichkataMi;
    int maksNaKolichkata;

    public Client(SHOP.shop shop, int myMoney, int maksNaKolichkata) {
        this.shop = shop;
        this.myMoney = myMoney;
        kolichkataMi  = new HashMap<>();
        this.maksNaKolichkata = maksNaKolichkata;
    }

    void pokupkaNaKilogram(String name,int kilogrami){
        if (kolichkataMi.size() < this.maksNaKolichkata) {
            kolichkataMi.put(name, kilogrami);
                shop.kolichestvaZaKilogram.replace(name, shop.kolichestvaZaKilogram.get(name), shop.kolichestvaZaKilogram.get(name) - kilogrami);

        }
    }

    void pokupkaNaBroika(String name,int broi) {
        if (kolichkataMi.size() < this.maksNaKolichkata) {
            kolichkataMi.put(name, broi);
                shop.kolichestvaZaBroi.replace(name, shop.kolichestvaZaBroi.get(name), shop.kolichestvaZaBroi.get(name) - broi);
            }
    }

    void premahvaneNaBroika(String name,int broi){
        kolichkataMi.replace(name,kolichkataMi.get(name),kolichkataMi.get(name)-broi);
        shop.kolichestvaZaBroi.replace(name,shop.kolichestvaZaBroi.get(name),shop.kolichestvaZaBroi.get(name)+broi);
    }
    void premahvaneNaKilogram(String name,int kilogram){
        kolichkataMi.replace(name,kolichkataMi.get(name),kolichkataMi.get(name)-kilogram);
        shop.kolichestvaZaKilogram.replace(name,shop.kolichestvaZaKilogram.get(name),shop.kolichestvaZaKilogram.get(name)+kilogram);
    }
    void plashtane(){
        for(Map.Entry<String,Integer> broi : kolichkataMi.entrySet()){
           if (broi.getKey().equals("beer")){
               myMoney-=broi.getValue()*shop.cenaZaBroi.get("beer");
               shop.money+=broi.getValue()*shop.cenaZaBroi.get("beer");
           }
            if (broi.getKey().equals("book")){
                myMoney-=broi.getValue()*shop.cenaZaBroi.get("book");
                shop.money+=broi.getValue()*shop.cenaZaBroi.get("book");
            }
            if (broi.getKey().equals("chair")){
                myMoney-=broi.getValue()*shop.cenaZaBroi.get("chair");
                shop.money+=broi.getValue()*shop.cenaZaBroi.get("chair");
            }

        }
        for(Map.Entry<String,Integer> kilogrami : kolichkataMi.entrySet()){
            if (kilogrami.getKey().equals("meat")){
                myMoney-=kilogrami.getValue()*shop.cenaZaKilogram.get("meat");
                shop.money+=kilogrami.getValue()*shop.cenaZaKilogram.get("meat");
            }
            if (kilogrami.getKey().equals("chees")){
                myMoney-=kilogrami.getValue()*shop.cenaZaKilogram.get("chees");
                shop.money+=kilogrami.getValue()*shop.cenaZaKilogram.get("chees");
            }
            if (kilogrami.getKey().equals("fish")){
                myMoney-=kilogrami.getValue()*shop.cenaZaKilogram.get("fish");
                shop.money+=kilogrami.getValue()*shop.cenaZaKilogram.get("fish");
            }

        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
