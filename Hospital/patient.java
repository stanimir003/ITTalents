package Hospital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class patient {

    String name;
    int age;
    long number;
    doctor myDoctor;
    String pol;
    int dniLechenie;
    TreeMap<String, ArrayList<String>> diagnoza;

    public patient(String name, int age, long number, String pol,doctor doctor) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.pol = pol;
        if (doctor.zaetost == false) {
            this.myDoctor = doctor;
        }
        else {
            System.out.println("доктора е зает,моля изчакайте");
        }
        karton(name,age,number);
        diagnoza = new TreeMap<>();
    }

    void karton(String name, int age, long number){
        System.out.println("----картон----");
        System.out.println("име : " + name);
        System.out.println("години : " + age);
        System.out.println("тел : " + number);
        System.out.println("дни за лечение " + this.dniLechenie);
        System.out.println("лекуващ лекар " + myDoctor.name);
    }

    public String getPol() {
        return pol;
    }
}
