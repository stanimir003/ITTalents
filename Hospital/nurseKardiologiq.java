package Hospital;
import Hospital.Hospital.hospitalKardiologia;

public class nurseKardiologiq {


    String name;
    long number;
    int staj;
    hospitalKardiologia hospitalKardiologia;

    public nurseKardiologiq(String name, long number, int staj) {
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
            hospitalKardiologia.getHospitalKardiologia().remove(hospitalKardiologia.getStaqJeni(),pacienta);
            hospitalKardiologia.prazniLeglaJeni++;
            hospitalKardiologia.prazniLeglaZaJeni++;
        }
        else if(pacienta.pol.equals("men")) {
            System.out.println("Пациента"+ pacienta.number + " се изписа ");
            hospitalKardiologia.getHospitalKardiologia().remove(hospitalKardiologia.getStaqMuje(),pacienta);
            hospitalKardiologia.prazniLeglaMuje++;
            hospitalKardiologia.praznniLeglaZaMuje++;
        }

    }


}
