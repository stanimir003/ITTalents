package Hospital;

import java.util.ArrayList;

public class doctor {

    String name;
    String specializacia;
    long number;
    boolean zaetost;
    patient patient;

    public doctor(String name, String specializacia, long number,boolean zaetost) {
        this.name = name;
        this.specializacia = specializacia;
        this.number = number;
        this.zaetost=zaetost;
    }
    void izgotqneNaDiagnoza(patient patienta){
        String [] diagnozi = {"диагноза 1","диагноза 2","диагноза 3"};
        ArrayList<String> lekarstvo = new ArrayList<>();
        lekarstvo.add("Лекьрство 1");
        lekarstvo.add("Лекьрство 2");
        lekarstvo.add("Лекьрство 3");
        int lekarstva = 2;
        int dniZaLechenie = demo.randomNumber(3,5);
        patienta.dniLechenie=dniZaLechenie;
        System.out.println("Пациента се нуждае от " + dniZaLechenie + " дни за лечение");
       String diagnoza = diagnozi[demo.randomNumber(0,2)];
        System.out.println("Пациента е с диагноза : " + diagnoza);
        patienta.diagnoza.put(diagnoza,new ArrayList<>());
        int broiLekrastva = demo.randomNumber(1,3);
        if (diagnoza.equals("диагноза 1")) {
            patienta.diagnoza.put("диагноза 1",new ArrayList<>());
            if (broiLekrastva == 1) {
                patienta.diagnoza.get("диагноза 1").add(lekarstvo.get(demo.randomNumber(0, lekarstva)));
            } else if (broiLekrastva == 2) {
                patienta.diagnoza.get("диагноза 1").add(lekarstvo.get(demo.randomNumber(0, lekarstva)));
                patienta.diagnoza.get("диагноза 1").add(lekarstvo.get(demo.randomNumber(0, lekarstva)));
            } else if (broiLekrastva == 3) {
                patienta.diagnoza.get("диагноза 1").add(lekarstvo.get(demo.randomNumber(0, lekarstva)));
                patienta.diagnoza.get("диагноза 1").add(lekarstvo.get(demo.randomNumber(0, lekarstva)));
                patienta.diagnoza.get("диагноза 1").add(lekarstvo.get(demo.randomNumber(0, lekarstva)));
            }
        }
        else
        if (diagnoza.equals("диагноза 2")) {
            patienta.diagnoza.put("диагноза 2",new ArrayList<>());
            if (broiLekrastva == 1) {
                patienta.diagnoza.get("диагноза 2").add(lekarstvo.get(demo.randomNumber(0, lekarstva)));
            } else if (broiLekrastva == 2) {
                patienta.diagnoza.get("диагноза 2").add(lekarstvo.get(demo.randomNumber(0, lekarstva)));
                patienta.diagnoza.get("диагноза 2").add(lekarstvo.get(demo.randomNumber(0, lekarstva)));
            } else if (broiLekrastva == 3) {
                patienta.diagnoza.get("диагноза 2").add(lekarstvo.get(demo.randomNumber(0, lekarstva)));
                patienta.diagnoza.get("диагноза 2").add(lekarstvo.get(demo.randomNumber(0, lekarstva)));
                patienta.diagnoza.get("диагноза 2").add(lekarstvo.get(demo.randomNumber(0, lekarstva)));
            }
        }
        else
        if (diagnoza.equals("диагноза 3")) {
            patienta.diagnoza.put("диагноза 3",new ArrayList<>());
            if (broiLekrastva == 1) {
                patienta.diagnoza.get("диагноза 3").add(lekarstvo.get(demo.randomNumber(0, lekarstva)));
            } else if (broiLekrastva == 2) {
                patienta.diagnoza.get("диагноза 3").add(lekarstvo.get(demo.randomNumber(0, lekarstva)));
                patienta.diagnoza.get("диагноза 3").add(lekarstvo.get(demo.randomNumber(0, lekarstva)));
            } else if (broiLekrastva == 3) {
                patienta.diagnoza.get("диагноза 3").add(lekarstvo.get(demo.randomNumber(0, lekarstva)));
                patienta.diagnoza.get("диагноза 3").add(lekarstvo.get(demo.randomNumber(0, lekarstva)));
                patienta.diagnoza.get("диагноза 3").add(lekarstvo.get(demo.randomNumber(0, lekarstva)));
            }
        }






    }
}
