public class NaiDulgaDumaVIzrecheniqta {
    public static void main(String[] args) {
        String text = "Addd gggg tttttttt.ffff gg.tttttttttt ww";
        String[] txt = text.split("\\.");
        for (int i = 0; i < txt.length; i++) {
            String[] words = txt[i].split(" ");
            int longWordIndex = 0;
            for (int j = 1; j <=words.length-1 ; j++) {
                if (words[longWordIndex].length() < words[j].length()){
                    longWordIndex=j;
                }
            }
            System.out.print( i + 1 +" sentence " + words.length + " words");
            System.out.println(" Longest word "+words[longWordIndex]);
            System.out.println();
        }
    }
}
