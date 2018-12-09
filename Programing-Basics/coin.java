import java.util.Random;
import java.util.Scanner;

public class coin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter1=0;
        int counter2 = 0;
        do{
            System.out.println(" “Heads” or “Tails” ");
            String ggg = scanner.nextLine();
            if (ggg.equalsIgnoreCase("Heads") ){
                counter1++;
            }else{
                counter1 = 0;
            }
            if (ggg.equalsIgnoreCase("Tails") ){
                counter2++;
            }else{
                counter2 = 0;
            }
            if (counter1 == 5) {
                System.out.println("Вие хвърлихте 5 пъти Heads");
                break;
            }
            if (counter2 == 5) {
                System.out.println("Вие хвърлихте 5 пъти Tails");
                break;
            }

        }while (counter1 <5 || counter2<5 );

    }
}
