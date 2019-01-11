package Hospital;

import java.util.Random;
import Hospital.Hospital.hospitalKardiologia;
import Hospital.Hospital.hospitalOrtopedia;
import Hospital.Hospital.hospitalVirusologia;

public class demo {
    public static void main(String[] args) {

        hospitalOrtopedia ortopedia = new hospitalOrtopedia();
        hospitalVirusologia virusologia = new hospitalVirusologia();
        hospitalKardiologia kardiologia = new hospitalKardiologia();
        doctor ivanov = new doctor("Ivanov","ORTOPED",65323323,false);
        patient patient = new patient("иван",26,56824972,"men",ivanov);
        patient patient3 = new patient("иван",26,56824972,"men",ivanov);
        virusologia.priem(patient);
        virusologia.priem(patient3);
        ivanov.izgotqneNaDiagnoza(patient);
        System.out.println(patient.diagnoza);
        doctor petkov = new doctor("Ivanov","ORTOPED",65323323,false);
        patient patient2 = new patient("иван",26,56824972,"woman",petkov);
        kardiologia.priem(patient2);
        ivanov.izgotqneNaDiagnoza(patient2);
        System.out.println(patient2.diagnoza);
        kardiologia.pokajiOdelenieto();
        virusologia.pokajiOdelenieto();
        nurseKardiologiq NurseKardiologiq = new nurseKardiologiq("IVANKA",5325558,5);
        NurseKardiologiq.vizitaciq(patient2);
        virusologia.spravki();
    }
    public static int randomNumber(int min, int max){
        return new Random().nextInt(max - min + 1) + min;
    }
}
