package Library;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DEMO {
    public static void main(String[] args) {
        MusicInstrumentsShop musicInstrumentsShop = new MusicInstrumentsShop();
       /* musicInstrumentsShop.katalogPoVid();
        musicInstrumentsShop.katalogPoCena();
        musicInstrumentsShop.nalichnosti();
        musicInstrumentsShop.PriemaneNaStoka("fleita",5);
        musicInstrumentsShop.nalichnosti();
        */
      musicInstrumentsShop.prodajba("fleita",4);
        musicInstrumentsShop.prodajba("akordeon",5);
        musicInstrumentsShop.prodajba("tupan",3);
        musicInstrumentsShop.Spravki();

    }
    public static int randomNumber(int min, int max){
        return new Random().nextInt(max - min + 1) + min;
    }
}
