public class Krustoslovica {

    public static void main(String[] args) {

        String word1 = "keril";
        String word2 = "maria";

        char[][] crossword = new char[word2.length()][word1.length()];
        for (int i = 0; i < crossword.length; i++) {
            for (int j = 0; j < crossword[i].length; j++) {
                crossword[i][j] = ' ';
            }
        }

        int row = 0;
        int col = 0;
        for (int i = 0; i < word1.length(); i++) {
            char symbol = word1.charAt(i);//$symbol = $word1{$i};
            boolean found = false;
            for (int j = 0; j < word2.length(); j++) {
                if(symbol == word2.charAt(j)){
                    row = j;
                    col = i;
                    found = true;
                    break;
                }
            }
            if(found){
                break;
            }
        }
        for (int i = 0; i < crossword[row].length; i++) {
            crossword[row][i] = word1.charAt(i);
        }
        for (int i = 0; i < crossword.length; i++) {
            crossword[i][col] = word2.charAt(i);
        }

        for (int i = 0; i < crossword.length; i++) {
            for (int j = 0; j < crossword[i].length; j++) {
                System.out.print(crossword[i][j]);
            }
            System.out.println();
        }

    }
}
