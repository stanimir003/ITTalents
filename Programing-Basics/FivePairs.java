import java.util.Random;

public class FivePairs {
    public static void main(String[] args) {
        int min = 1;
        int max = 6;
        Random r = new Random();
        int counter=0;
        int countingTrice=0;
        do {
            int resultFirstDice = r.nextInt(max - min) + min;
            int resultSecondDice = r.nextInt(max - min) + min;
            System.out.println("първи зар " + resultFirstDice + " втори зар " + resultSecondDice);
            if (resultFirstDice == resultSecondDice){
                counter++;
                countingTrice++;
            }
            else{
                counter=0;
                countingTrice++;
            }
            if (counter >=2 && counter <5){
                System.out.println("Хвърлен е чифт " + counter +" но не е 5 поредни");
            }

        }while (counter<5);
        System.out.println("Достигнахте 5 поредни чифта");
        System.out.println(countingTrice + " опита");
    }
}
