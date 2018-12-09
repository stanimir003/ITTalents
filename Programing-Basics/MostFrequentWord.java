import java.util.Scanner;

public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String text = "fff fff fff Ffff hhh jjjj Hhh";
       String [] txt = text.split(" ");
       mostFrequentWord(txt);

    }
    static void mostFrequentWord(String [] txt){
        int maxCounter = 0;
        int position =0;
        for (int i = 0; i <txt.length ; i++) {
            int counter = 0;
            for (int j = 0; j <txt.length ; j++) {
                if (txt[i].equalsIgnoreCase(txt[j])){
                    counter++;
                }
            }
            if (counter>maxCounter){
                maxCounter=counter;
                position =i;
            }
        }
        System.out.println("най често срещаната дума е : " + txt[position] + " " + maxCounter + " пъти");
    }

}
