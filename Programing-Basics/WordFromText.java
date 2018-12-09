import java.util.Scanner;

public class WordFromText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = "Test is for testing your knowledge so if you don`t know anything, nothing can save you";
        String text1 = text.toLowerCase();
        String[] txt = text1.split(" ");
        wordFromText(txt);
    }
    static void wordFromText(String [] txt){
        for (int i = 0; i <txt.length ; i++) {
            for (int j = 0; j <txt.length; j++) {
                if(txt[i].contains(txt[j])&&!(txt[i].equals(txt[j]))){
                    System.out.println(txt[j] + " from " + txt[i]);
                }
            }
        }
    }
}
