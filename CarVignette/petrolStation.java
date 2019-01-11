package CarVignette;

import CarVignette.vegnettes.Vignette;
import CarVignette.vegnettes.vigBus;
import CarVignette.vegnettes.vigCar;
import CarVignette.vegnettes.vigTruck;

import java.util.ArrayList;
import java.util.Random;

public class petrolStation {


    int money;
    ArrayList<Vignette> spisukVinetki;
    int [] periodi = {1,30,365};

     public petrolStation() {
        this.money = 0;
        spisukVinetki = new ArrayList<>();

        for (int i = 0; i <3000 ; i++) {
            spisukVinetki.add(i, new vigCar(1, periodi[randomNumber(0,periodi.length-1)]));
        }
        for (int i = 3000; i <6000 ; i++) {
            spisukVinetki.add(i, new vigBus(1, periodi[randomNumber(0,periodi.length-1)]));
        }
        for (int i = 6000; i <9000 ; i++) {
            spisukVinetki.add(i, new vigTruck(1, periodi[randomNumber(0,periodi.length-1)]));
        }

        spisukVinetki.sort(new comparatorByPrice());
    }
    public static int randomNumber(int min, int max){
        return new Random().nextInt(max - min + 1) + min;
    }

    void showVignette(){
        for (Vignette v : spisukVinetki){
            System.out.println("Цвят : "+v.getColor()+ "  " + v.vzemaneNaCena(v.getColor(),v.getVigDate()) + " ЛВ");
        }
    }
}
