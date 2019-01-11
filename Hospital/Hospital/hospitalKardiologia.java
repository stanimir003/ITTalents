package Hospital.Hospital;

import Hospital.patient;

import java.util.HashMap;
import java.util.Map;

public class hospitalKardiologia extends hospital {

    Hospital.patient patient;

    HashMap<Integer, HashMap<patient,Integer>> hospitalKardiologia;
    int staqJeni=1;
    int staqMuje=6;
    public int prazniLeglaJeni =3;
     public int prazniLeglaMuje =3;
     public int prazniLeglaZaJeni = 15;
     public int praznniLeglaZaMuje = 15;

    public hospitalKardiologia() {
        hospitalKardiologia= new HashMap<>();
        hospitalKardiologia.put(staqJeni,new HashMap<>());
        hospitalKardiologia.put(staqMuje,new HashMap<>());
    }

    @Override
   public void priem(Hospital.patient patienta) {
        super.priem(patienta);
        if (staqJeni <=5) {
            if (prazniLeglaJeni == 0) {
                hospitalKardiologia.put(staqJeni++, new HashMap<>());
            } else if (patienta.getPol().equals("woman")) {
                hospitalKardiologia.get(staqJeni).put(patienta, prazniLeglaJeni--);
                this.prazniLeglaZaJeni--;
            }
        }
        if(staqMuje <=10) {
            if (prazniLeglaMuje == 0) {
                hospitalKardiologia.put(staqMuje++, new HashMap<>());
            } else if (patienta.getPol().equals("men")) {
                hospitalKardiologia.get(staqMuje).put(patienta, prazniLeglaMuje--);
                this.praznniLeglaZaMuje--;
            }
        }

    }

    @Override
   public void spravki() {
        System.out.println("  в кардиологията има " + this.prazniLeglaZaJeni + " за жени");
        System.out.println("  в кардиологията има " + this.praznniLeglaZaMuje + " за мъже");
    }

    public void pokajiOdelenieto(){
        for(Integer staq : hospitalKardiologia.keySet()){

            if(staq<=5) {
                System.out.println("---- staq" + staqJeni + " ----");
                for (Map.Entry<Hospital.patient, Integer> leglo : hospitalKardiologia.get(staqJeni).entrySet()) {
                    System.out.println(" на легло " + leglo.getValue() + " e " + leglo.getKey());
                }
            }else
            if(staq<=10) {
                System.out.println("---- staq" + staqMuje + " ----");
                for (Map.Entry<Hospital.patient, Integer> leglo : hospitalKardiologia.get(staqMuje).entrySet()) {
                    System.out.println(" на легло " + leglo.getValue() + " e " + leglo.getKey());
                }
            }
        }
    }

    public Hospital.patient getPatient() {
        return patient;
    }

    public HashMap<Integer, HashMap<Hospital.patient, Integer>> getHospitalKardiologia() {
        return hospitalKardiologia;
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

    @Override
    public String toString() {
        return super.toString();
    }
}
