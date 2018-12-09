public class PowerWithAddition {

    public static void main(String[] args) {

        int x = 3;
        int y = 4;
        //81
//        int result = power(x, y);
        int result = powerRec(x, y, 1, 0);
        System.out.println(result);
    }

    static int power(int x, int y){
        int power = 1;
        for (int i = 0; i < y; i++) {
            power*=x;
        }
        return power;
    }

    static int powerRec(int x, int y, int power, int i){
        if(i == y){
            return power;
        }
        int proizv = 0;
        for (int j = 0; j < x; j++) {
            proizv += power;
        }
        return powerRec(x, y, proizv, i+1);
    }
}
