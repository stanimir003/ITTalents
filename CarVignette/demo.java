package CarVignette;

import CarVignette.vegnettes.Vignette;
import CarVignette.vehicle.Vehicle;
import CarVignette.vehicle.bus;
import CarVignette.vehicle.car;
import CarVignette.vehicle.truck;

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {


        petrolStation benzinostncia = new petrolStation();
        driver pesho = new driver("pesho",5000,benzinostncia);

        ArrayList<Vehicle> koli = new ArrayList<>();
        Vehicle kola = new car(1);
        Vehicle bus = new bus(1);
        Vehicle kamion = new truck(1);
        for (int i = 0; i <200 ; i++) {
           int t =  petrolStation.randomNumber(0,30);
            if (t <= 10){
                koli.add(new car(1));
            }else if (t>20){
                koli.add(new bus(1));
            }
            else {
                koli.add(new truck(1) );
            }
        }
        for(Vehicle v : koli){
            System.out.println(v.getModel());
        }

        pesho.prevozniStredstva.add(kola);
        pesho.prevozniStredstva.add(bus);
        pesho.prevozniStredstva.add(kamion);

        pesho.buyVignetteByOne(0,1);
        System.out.println(pesho.getMyMoney());



    }
}
