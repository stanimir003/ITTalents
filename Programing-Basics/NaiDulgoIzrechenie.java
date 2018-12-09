import java.util.Arrays;

public class NaiDulgoIzrechenie {

    public static void main(String[] args) {

        String text = "Today is a good day for test. Sun is shining. The students are happy. The birds are blue.";
        String[] sentence = text.trim().split("(?=[A-Z])");

        System.out.println(Arrays.toString(sentence));

        int maxCounter = 0;
        int index = 0;
        for (int i = 0; i < sentence.length; i++) {
            int counter = 0;
            for (int j = 0; j < sentence[i].length(); j++) {
                if(sentence[i].charAt(j) != ' '){
                    counter++;
                }
            }

            if(counter > maxCounter){
                maxCounter = counter;
                index = i;
            }
        }
        System.out.println(sentence[index]);

    }

}
