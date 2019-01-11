package Library;

import java.util.*;

public class MusicInstrumentsShop {
    int money;
    HashMap<String, Integer> ceni;
    HashMap<String, TreeMap<String, Integer>> kolichestvo;
    HashMap<String,Integer> spravka;
    String naiProdavanInstrument;

    public MusicInstrumentsShop() {
        this.money = 0;
        ceni = new HashMap<>();
        kolichestvo = new HashMap<>();
        spravka = new HashMap<>();

        kolichestvo.put("Strunni", new TreeMap<>());
        kolichestvo.put("Udarni", new TreeMap<>());
        kolichestvo.put("Duhovi", new TreeMap<>());
        kolichestvo.put("Klavishni", new TreeMap<>());
        kolichestvo.put("Elektronni", new TreeMap<>());
        kolichestvo.get("Strunni").put("Cigulka", 0);
        kolichestvo.get("Strunni").put("Viola", 5);
        kolichestvo.get("Strunni").put("Kontrabas", 5);
        kolichestvo.get("Strunni").put("Arfa", 5);
        kolichestvo.get("Strunni").put("kitara", 5);
        kolichestvo.get("Strunni").put("gudilka", 5);
        kolichestvo.get("Udarni").put("barabani", 5);
        kolichestvo.get("Udarni").put("tarambuka", 5);
        kolichestvo.get("Udarni").put("tupan", 5);
        kolichestvo.get("Udarni").put("daire", 5);
        kolichestvo.get("Duhovi").put("trompet", 5);
        kolichestvo.get("Duhovi").put("trombon", 5);
        kolichestvo.get("Duhovi").put("tuba", 5);
        kolichestvo.get("Duhovi").put("fleita", 5);
        kolichestvo.get("Klavishni").put("organ", 5);
        kolichestvo.get("Klavishni").put("piano", 5);
        kolichestvo.get("Klavishni").put("akordeon", 5);
        kolichestvo.get("Elektronni").put("sintezator", 5);
        kolichestvo.get("Elektronni").put("bas-kitara", 5);
        kolichestvo.get("Elektronni").put("elektricheska cigulka", 5);

        ceni.put("Cigulka", DEMO.randomNumber(5, 500));
        ceni.put("Viola", DEMO.randomNumber(5, 500));
        ceni.put("Kontrabas", DEMO.randomNumber(5, 500));
        ceni.put("Arfa", DEMO.randomNumber(5, 500));
        ceni.put("kitara", DEMO.randomNumber(5, 500));
        ceni.put("gudilka", DEMO.randomNumber(5, 500));
        ceni.put("barabani", DEMO.randomNumber(5, 500));
        ceni.put("tarambuka", DEMO.randomNumber(5, 500));
        ceni.put("tupan", DEMO.randomNumber(5, 500));
        ceni.put("daire", DEMO.randomNumber(5, 500));
        ceni.put("trompet", DEMO.randomNumber(5, 500));
        ceni.put("trombon", DEMO.randomNumber(5, 500));
        ceni.put("tuba", DEMO.randomNumber(5, 500));
        ceni.put("fleita", DEMO.randomNumber(5, 500));
        ceni.put("piano", DEMO.randomNumber(5, 500));
        ceni.put("akordeon", DEMO.randomNumber(5, 500));
        ceni.put("sintezator", DEMO.randomNumber(5, 500));
        ceni.put("bas-kitara", DEMO.randomNumber(5, 500));
        ceni.put("organ", DEMO.randomNumber(5, 500));
        ceni.put("elektricheska cigulka", DEMO.randomNumber(5, 500));

    }

    void katalogPoVid() {
        for (String vid : kolichestvo.keySet()) {
            System.out.println("-----" + vid + "-----");
            for (Map.Entry<String, Integer> kolichestvo : kolichestvo.get(vid).entrySet()) {
                System.out.println(kolichestvo.getKey() + "  " + kolichestvo.getValue() + " бройки");
            }
        }
    }

    void katalogPoCena(){
        ComparatorByValue comparatorByValue = new ComparatorByValue();
        ArrayList<Map.Entry<String,Integer>> list = new ArrayList<>();
        list.addAll(ceni.entrySet());
        list.sort(comparatorByValue);
        for (Map.Entry<String,Integer> kolichestvo : list) {
                System.out.println(kolichestvo.getKey() + "  " + kolichestvo.getValue() + " ЛВ");
            }
    }

    void nalichnosti(){
        for (String vid : kolichestvo.keySet()) {
            System.out.println("-----" + vid + "-----");
            for (Map.Entry<String, Integer> kolichestvo : kolichestvo.get(vid).entrySet()) {
                if (kolichestvo.getValue() > 0) {
                    System.out.println(kolichestvo.getKey() + "  " + kolichestvo.getValue() + " бройки");
                }
                else {
                    System.out.println(kolichestvo.getKey() +" не е в наличност");
                }
            }
        }
    }

    void PriemaneNaStoka(String name,int broi){
        int oldValue;
        if (name.equals("Cigulka")||name.equals("Viola")||name.equals("Kontrabas")||name.equals("Arfa")||name.equals("kitara")||name.equals("gudilka")){
            oldValue=kolichestvo.get("Strunni").get(name);
            kolichestvo.get("Strunni").put(name,broi+oldValue);
        }
        if (name.equals("barabani")||name.equals("tarambuka")||name.equals("tupan")||name.equals("daire")){
            oldValue=kolichestvo.get("Udarni").get(name);
            kolichestvo.get("Udarni").put(name,broi+oldValue);
        }
        if (name.equals("trompet")||name.equals("trombon")||name.equals("tuba")||name.equals("fleita")){
            oldValue=kolichestvo.get("Duhovi").get(name);
            kolichestvo.get("Duhovi").put(name,broi+oldValue);
        }
        if (name.equals("organ")||name.equals("piano")||name.equals("akordeon")){
            oldValue=kolichestvo.get("Klavishni").get(name);
            kolichestvo.get("Klavishni").put(name,broi+oldValue);
        }
        if (name.equals("sintezator")||name.equals("bas-kitara")||name.equals("elektricheska cigulka")){
            oldValue=kolichestvo.get("Elektronni").get(name);
            kolichestvo.get("Elektronni").put(name,broi+oldValue);
        }

    }

    void prodajba(String name,int broi){
        int oldValue;
        if (name.equals("Cigulka")||name.equals("Viola")||name.equals("Kontrabas")||name.equals("Arfa")||name.equals("kitara")||name.equals("gudilka")){
            oldValue=kolichestvo.get("Strunni").get(name);
            int cenaNaProdukta = ceni.get(name);
            kolichestvo.get("Strunni").replace(name,oldValue,oldValue-broi);
            money += cenaNaProdukta*broi;
            if (spravka.keySet().equals(name)){
                spravka.replace(name,spravka.get(name),spravka.get(name) + broi);
            }
            else{
                spravka.put(name,broi);
            }
        }
        if (name.equals("barabani")||name.equals("tarambuka")||name.equals("tupan")||name.equals("daire")){
            oldValue=kolichestvo.get("Udarni").get(name);
            int cenaNaProdukta = ceni.get(name);
            kolichestvo.get("Udarni").replace(name,oldValue,oldValue-broi);
            money += cenaNaProdukta*broi;
            if (spravka.keySet().equals(name)){
                spravka.replace(name,spravka.get(name),spravka.get(name) + broi);
            }
            else{
                spravka.put(name,broi);
            }
        }
        if (name.equals("trompet")||name.equals("trombon")||name.equals("tuba")||name.equals("fleita")){
            oldValue=kolichestvo.get("Duhovi").get(name);
            int cenaNaProdukta = ceni.get(name);
            kolichestvo.get("Duhovi").replace(name,oldValue,oldValue-broi);
            money += cenaNaProdukta*broi;
            if (spravka.keySet().equals(name)){
                spravka.replace(name,spravka.get(name),spravka.get(name) + broi);
            }
            else{
                spravka.put(name,broi);
            }
        }
        if (name.equals("organ")||name.equals("piano")||name.equals("akordeon")){
            oldValue=kolichestvo.get("Klavishni").get(name);
            int cenaNaProdukta = ceni.get(name);
            kolichestvo.get("Klavishni").replace(name,oldValue,oldValue-broi);
            money += cenaNaProdukta*broi;
            if (spravka.keySet().equals(name)){
                spravka.replace(name,spravka.get(name),spravka.get(name) + broi);
            }
            else{
                spravka.put(name,broi);
            }
        }
        if (name.equals("sintezator")||name.equals("bas-kitara")||name.equals("elektricheska cigulka")){
            oldValue=kolichestvo.get("Elektronni").get(name);
            int cenaNaProdukta = ceni.get(name);
            kolichestvo.get("Elektronni").replace(name,oldValue,oldValue-broi);
            money += cenaNaProdukta*broi;
            if (spravka.keySet().equals(name)){
                spravka.replace(name,spravka.get(name),spravka.get(name) + broi);
            }
            else{
                spravka.put(name,broi);
            }
        }

    }

    void Spravki(){
        ComparatorByValue comparatorByValue = new ComparatorByValue();
        ComparatorByValue2 comparatorByValue2 = new ComparatorByValue2();
        ArrayList<Map.Entry<String, Integer>> spravki = new ArrayList();
        spravki.addAll(spravka.entrySet());
        spravki.sort(comparatorByValue);
        System.out.println(spravki);
        System.out.println("най-продаван инструмент е " + spravki.get(0));
        spravki.sort(comparatorByValue2);
        System.out.println("най-непродаван инструмент е " + spravki.get(0));
        System.out.println("Печалбата е " + money);

    }

}
