package Hospital;

import Hospital.Hospital.hospitalOrtopedia;
public class nurseOrtopedia {

    String name;
    long number;
    int staj;
hospitalOrtopedia hospitalOrtopedia;
    public nurseOrtopedia(String name, long number, int staj) {
        this.name = name;
        this.number = number;
        this.staj = staj;
    }

    void vizitaciq(patient pacienta){
        if (pacienta.dniLechenie >=0){
            pacienta.dniLechenie--;
            System.out.println("на пациента му остават "+ pacienta.dniLechenie+ " дни за лечение");
        }
        else if(pacienta.pol.equals("women")) {
            System.out.println("Пациента"+ pacienta.number + " се изписа ");
            hospitalOrtopedia.getHospitalOrtopedia().remove(hospitalOrtopedia.getStaqJeni(),pacienta);
            hospitalOrtopedia.prazniLeglaJeni++;
            hospitalOrtopedia.prazniLeglaZaJeni++;
        }
        else if(pacienta.pol.equals("men")) {
            System.out.println("Пациента"+ pacienta.number + " се изписа ");
            hospitalOrtopedia.getHospitalOrtopedia().remove(hospitalOrtopedia.getStaqMuje(),pacienta);
            hospitalOrtopedia.prazniLeglaMuje++;
        }

    }

}
