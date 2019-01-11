package Hospital.Hospital;

import java.util.HashMap;
import Hospital.patient;

public abstract  class hospital {

    patient patient;

    HashMap<Integer,HashMap<patient,Integer>> otdelenie;

    public hospital() {
        otdelenie= new HashMap<>();
    }

    void priem(patient patient) {
    }
    void spravki(){

    }


}
