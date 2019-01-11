package Hospital.Hospital;

import Hospital.patient;

import java.util.HashMap;
import java.util.Map;

public class hospitalOrtopedia extends hospital {

    Hospital.patient patient;
    int staqJeni=1;
    int staqMuje=6;
    public int prazniLeglaJeni =3;
    public int prazniLeglaMuje =3;
    public int prazniLeglaZaJeni = 15;
    public int praznniLeglaZaMuje = 15;

    HashMap<Integer, HashMap<Hospital.patient,Integer>> hospitalOrtopedia;

    public hospitalOrtopedia() {
        hospitalOrtopedia= new HashMap<>();
        hospitalOrtopedia.put(staqJeni,new HashMap<>());
        hospitalOrtopedia.put(staqMuje,new HashMap<>());
    }

    @Override
   public void priem(Hospital.patient patienta) {
        super.priem(patient);
        if (staqJeni <=5) {
            if (prazniLeglaJeni == 0) {
                hospitalOrtopedia.put(staqJeni++, new HashMap<>());
            } else if (patienta.getPol().equals("woman")) {
                hospitalOrtopedia.get(staqJeni).put(patienta, prazniLeglaJeni--);
                this.prazniLeglaZaJeni--;
            }
        }
        if(staqMuje <=10) {
            if (prazniLeglaMuje == 0) {
                hospitalOrtopedia.put(staqMuje++, new HashMap<>());
            } else if (patienta.getPol().equals("men")) {
                hospitalOrtopedia.get(staqMuje).put(patienta, prazniLeglaMuje--);
                this.praznniLeglaZaMuje--;
            }
        }
    }
   public void spravki() {
        System.out.println("  в кардиологията има " + this.prazniLeglaZaJeni + " за жени");
        System.out.println("  в кардиологията има " + this.praznniLeglaZaMuje + " за мъже");
    }
    public void pokajiOdelenieto(){
        for(Integer staq : hospitalOrtopedia.keySet()){

            if(staq<=5) {
                System.out.println("---- staq" + staqJeni + " ----");
                for (Map.Entry<Hospital.patient, Integer> leglo : hospitalOrtopedia.get(staqJeni).entrySet()) {
                    System.out.println(" на легло " + leglo.getValue() + " e " + leglo.getKey());
                }
            }else
            if(staq<=10) {
                System.out.println("---- staq" + staqMuje + " ----");
                for (Map.Entry<Hospital.patient, Integer> leglo : hospitalOrtopedia.get(staqMuje).entrySet()) {
                    System.out.println(" на легло " + leglo.getValue() + " e " + leglo.getKey());
                }
            }
        }
    }

    public Hospital.patient getPatient() {
        return patient;
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

    public HashMap<Integer, HashMap<Hospital.patient, Integer>> getHospitalOrtopedia() {
        return hospitalOrtopedia;
    }
}
