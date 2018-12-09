import java.util.Arrays;

public class JavaTask2 {
    public static void main(String[] args) {

        String text = "This test has some pretty fun tasks.";
        String textt = text.toLowerCase();
        String[] myArray = textt.split(" ");

        sortedWords(myArray);
        }
        static void sortedWords(String [] myArray){
            for (int i = 0; i < myArray.length ; i++) {
                for (int j = i+1; j < myArray.length; j++) {
                    if (myArray[i].compareTo(myArray[j]) > 0) {
                        String temp = myArray[i];
                        myArray[i] = myArray[j];
                        myArray[j] = temp;
                    }
                }
                System.out.print(myArray[i]+ " ");
            }

    }
}
