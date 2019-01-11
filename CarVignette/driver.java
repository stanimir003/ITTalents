package CarVignette;

import CarVignette.vegnettes.Vignette;
import CarVignette.vehicle.Vehicle;

import java.util.ArrayList;

public class driver  {

   private String name;
   ArrayList<Vehicle> prevozniStredstva;
   private int myMoney = 0;
   private petrolStation benzinostanciia;
   Vignette vignette;

    public driver(String name, int myMoney, petrolStation benzinostanciia) {
        this.name = name;
        this.myMoney = myMoney;
        this.benzinostanciia = benzinostanciia;
        prevozniStredstva = new ArrayList<>();
    }
    void buyVignetteByOne(int number,int period){

        if (prevozniStredstva.get(number).getModel().equals("car")) {
            for (Vignette v : benzinostanciia.spisukVinetki){
                if (v.getColor().equals("blue")){
                    if (v.getVigDate() == period){
                        prevozniStredstva.get(number).setVinetka(v);
                        benzinostanciia.spisukVinetki.remove(v);
                       myMoney-=vignette.vzemaneNaCena("blue",period);
                        benzinostanciia.money+=vignette.vzemaneNaCena("blue",period);
                        break;
                    }
                }
            }
        }else
        if (prevozniStredstva.get(number).getModel().equals("bus")) {
            for (Vignette v : benzinostanciia.spisukVinetki){
                if (v.getColor().equals("black")){
                    if (v.getVigDate() == period){
                        prevozniStredstva.get(number).setVinetka(v);
                        benzinostanciia.spisukVinetki.remove(v);
                        this.myMoney-=vignette.vzemaneNaCena("black",period);
                      benzinostanciia.money+=vignette.vzemaneNaCena("black",period);
                        break;
                    }
                }
            }
        }else
        if (prevozniStredstva.get(number).getModel().equals("truck")) {
            for (Vignette v : benzinostanciia.spisukVinetki){
                if (v.getColor().equals("yellow")){
                    if (v.getVigDate() == period){
                        prevozniStredstva.get(number).setVinetka(v);
                        benzinostanciia.spisukVinetki.remove(v);
                        myMoney-=vignette.vzemaneNaCena("yellow",period);
                        benzinostanciia.money+=vignette.vzemaneNaCena("yellow",period);
                        break;
                    }
                }
            }
        }

    }

    void buyVignetteForAll(int period){
        for (Vehicle vehicle : prevozniStredstva){

            if (vehicle.getModel().equals("car")){
                for (Vignette v : benzinostanciia.spisukVinetki){
                    if (v.getColor().equals("blue")){
                        if (v.getVigDate() == period){
                            vehicle.setVinetka(v);
                            benzinostanciia.spisukVinetki.remove(v);
                            break;
                        }

                    }
                }
            }else
            if (vehicle.getModel().equals("bus")){
                for (Vignette v : benzinostanciia.spisukVinetki){
                    if (v.getColor().equals("black")){
                        if (v.getVigDate() == period){
                            vehicle.setVinetka(v);
                            benzinostanciia.spisukVinetki.remove(v);
                            break;
                        }

                    }
                }
            }
            else  if (vehicle.getModel().equals("truck")){
                for (Vignette v : benzinostanciia.spisukVinetki){
                    if (v.getColor().equals("yellow")){
                        if (v.getVigDate() == period){
                            vehicle.setVinetka(v);
                            benzinostanciia.spisukVinetki.remove(v);
                            break;
                        }

                    }
                }
            }

        }
    }

    public int getMyMoney() {
        return myMoney;
    }
}
