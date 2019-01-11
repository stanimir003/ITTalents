package Hospital.Hospital;

import Hospital.patient;

import java.util.HashMap;
import java.util.Map;

public class hospitalVirusologia extends hospital{

    Hospital.patient patient;
    int staqJeni=1;
    int staqMuje=6;
     public int prazniLeglaJeni =3;
    public int prazniLeglaMuje =3;
   public int prazniLeglaZaJeni = 15;
   public int praznniLeglaZaMuje = 15;

    HashMap<Integer, HashMap<Hospital.patient,Integer>> hospitalVirusologia;

    public hospitalVirusologia() {
        hospitalVirusologia= new HashMap<>();
        hospitalVirusologia.put(staqJeni,new HashMap<>());
        hospitalVirusologia.put(staqMuje,new HashMap<>());
    }

    @Override
   public void priem(Hospital.patient patienta) {
        super.priem(patient);
        if (staqJeni <=5) {
            if (prazniLeglaJeni == 0) {
                hospitalVirusologia.put(staqJeni++, new HashMap<>());
            } else if (patienta.getPol().equals("woman")) {
                hospitalVirusologia.get(staqJeni).put(patienta, prazniLeglaJeni--);
                this.prazniLeglaZaJeni--;
            }
        }
        if(staqMuje <=10) {
            if (prazniLeglaMuje == 0) {
                hospitalVirusologia.put(staqMuje++, new HashMap<>());
            } else if (patienta.getPol().equals("men")) {
                hospitalVirusologia.get(staqMuje).put(patienta, prazniLeglaMuje--);
                this.praznniLeglaZaMuje--;
            }
        }
    }
    public void spravki() {
        System.out.println("  в кардиологията има " + this.prazniLeglaZaJeni + " за жени");
        System.out.println("  в кардиологията има " + this.praznniLeglaZaMuje + " за мъже");
    }
    public void pokajiOdelenieto(){
        for(Integer staq : hospitalVirusologia.keySet()){

            if(staq<=5) {
                System.out.println("---- staq" + staqJeni + " ----");
                for (Map.Entry<Hospital.patient, Integer> leglo : hospitalVirusologia.get(staqJeni).entrySet()) {
                    System.out.println(" на легло " + leglo.getValue() + " e " + leglo.getKey());
                }
            }else
            if(staq<=10) {
                System.out.println("---- staq" + staqMuje + " ----");
                for (Map.Entry<Hospital.patient, Integer> leglo : hospitalVirusologia.get(staqMuje).entrySet()) {
                    System.out.println(" на легло " + leglo.getValue() + " e " + leglo.getKey());
                }
            }
        }
    }

    public HashMap<Integer, HashMap<Hospital.patient, Integer>> getHospitalVirusologia() {
        return hospitalVirusologia;
    }

    public int getStaqJeni() {
        return staqJeni;
    }

    public int getStaqMuje() {
        return staqMuje;
    }

    public int getPrazniLeglaJeni() {
        return prazniLeglaJeni;
    }

    public int getPrazniLeglaMuje() {
        return prazniLeglaMuje;
    }
}
