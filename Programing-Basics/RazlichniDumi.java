public class RazlichniDumi {
    public static void main(String[] args) {
        String text1 = "Simple sentence that is first.";
        String text2 = "Another sentence that is second.";
        String [] txt1 = text1.split(" ");
        String [] txt2 = text2.split(" ");

        for (int i = 0; i <txt1.length ; i++) {
            if (!(txt1[i].equals(txt2[i]))){
                System.out.print(txt1[i] + " ");
            }
        }
    }
}
