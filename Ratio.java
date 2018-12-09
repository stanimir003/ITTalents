public class Ratio {

    public static void main(String[] args) {

        String text = "This text Is Very Difficult But no one else will try To Manage this One ";
        int upperCounter =0;
        int lowerCounter =0;
        for (int i = 0; i <text.length(); i++) {
            if ('A'<=text.charAt(i) && text.charAt(i)<='Z') {
                upperCounter++;
            } else if ('a'<=text.charAt(i) && text.charAt(i)<='z') {
                lowerCounter++;
            }
        }
        if (lowerCounter > upperCounter){
            lowerCounter = lowerCounter/upperCounter;
        }
        else{
            upperCounter=upperCounter/lowerCounter;
        }
        System.out.println(upperCounter + "  " + lowerCounter);
    }

}
