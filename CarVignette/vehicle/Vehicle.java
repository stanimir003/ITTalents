package CarVignette.vehicle;

import CarVignette.vegnettes.Vignette;

public class Vehicle {


    String model;
    Vignette vinetka;
    int productionYear;

    public Vehicle( int productionYear) {
        this.productionYear = productionYear;
    }

    public String getModel() {
        return model;
    }

    public Vignette getVinetka() {
        return vinetka;
    }

    public void setVinetka(Vignette vinetka) {
        this.vinetka = vinetka;
    }
}
