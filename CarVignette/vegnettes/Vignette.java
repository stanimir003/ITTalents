package CarVignette.vegnettes;

public class Vignette {

         int date;
        String color;
        int vigDate;

    public int getDate() {
        return date;
    }

    public String getColor() {
        return color;
    }

    public int getVigDate() {
        return vigDate;
    }

    public Vignette(int date, int Date) {
        this.date = date;
        if (Date == 1){
            this.vigDate = 1;
        }
        else if (Date == 30){
            this.vigDate = 30;
        }
        else if (Date == 365){
            this.vigDate = 365;
        }

    }

   public int vzemaneNaCena(String color,int Date){
        int price =0;
        if (color.equals("blue")){
            if (Date == 1){
                price=5;
            }else if (Date == 30){
                price=50;
            }
            else if (Date == 365){
                price=300;
            }
        }else
        if (color.equals("yellow")){
            if (Date == 1){
                price=7;
            }else if (Date == 30){
                price=70;
            }
            else if (Date == 365){
                price=420;
            }
        }else
        if (color.equals("black")){
            if (Date == 1){
                price=9;
            }else if (Date == 30){
                price=90;
            }
            else if (Date == 365){
                price=540;
            }
        }
        return price;
    }

    void zalepvaneVreme(String color){
        if (color.equals("yellow")){
            System.out.println("Времето за залепване е 10 секунди");
        }
        if (color.equals("blue")){
            System.out.println("Времето за залепване е 5 секунди");
        }
        if (color.equals("black")){
            System.out.println("Времето за залепване е 20 секунди");
        }

    }
}
