package Hospital;

import Hospital.Hospital.hospitalVirusologia;

import java.util.HashMap;
import java.util.Map;

public class nurseViusologiq {
    String name;
    long number;
    int staj;
    hospitalVirusologia hospitalVirusologia;
    patient pacienta;

    public nurseViusologiq(String name, long number, int staj) {
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
            hospitalVirusologia.getHospitalVirusologia().remove(hospitalVirusologia.getStaqJeni(),pacienta);
            hospitalVirusologia.prazniLeglaJeni++;
            hospitalVirusologia.prazniLeglaZaJeni++;
        }
        else if(pacienta.pol.equals("men")) {
            System.out.println("Пациента"+ pacienta.number + " се изписа ");
            hospitalVirusologia.getHospitalVirusologia().remove(hospitalVirusologia.getStaqMuje(),pacienta);
            hospitalVirusologia.prazniLeglaMuje++;
        }

    }

}
