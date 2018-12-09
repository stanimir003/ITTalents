public class KonCar {

    public static void main(String[] args) {

        char[][] board = {
                {'*', ' ', ' ', '*', ' ', ' ', ' ', ' '},
                {' ', 'K', ' ', ' ', ' ', '*', ' ', ' '},
                {' ', ' ', '*', ' ', ' ', ' ', ' ', ' '},
                {'*', ' ', '*', ' ', ' ', ' ', ' ', '*'},
                {' ', ' ', ' ', ' ', '*', ' ', ' ', ' '},
                {' ', ' ', 'C', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', '*', ' ', ' ', ' ', '*', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        };
        int konI = 1;
        int konJ = 1;
        int carI = 5;
        int carJ = 2;
        System.out.println(horseTakesKing(board, konI, konJ, carI, carJ));
    }

    static boolean horseTakesKing(char[][] board, int koni, int konj, int cari, int carj){
        //mark my spot as *
        board[koni][konj] = '*';
        //check new coordinates if in board
        int[][] possibleCoordinates = {
                {koni+1, konj+2},
                {koni+1, konj-2},
                {koni-1, konj+2},
                {koni-1, konj-2},
                {koni+2, konj+1},
                {koni+2, konj-1},
                {koni-2, konj+1},
                {koni-2, konj-1},
        };
        boolean[] outcomes = new boolean[8];
        for (int pos = 0; pos < possibleCoordinates.length; pos++) {
            int newkoni = possibleCoordinates[pos][0];
            int newkonj = possibleCoordinates[pos][1];
            if(newkoni < 0 || newkonj < 0 || newkoni >= board.length || newkonj >= board[newkoni].length){
                outcomes[pos] = false;
            }
            else
            //if new coordinate is car - return true
            if(newkoni == cari && newkonj == carj){
                outcomes[pos] =  true;
            }
            else
            //if new coordinate is * - return false
            if(board[newkoni][newkonj] == '*'){
                outcomes[pos] =  false;
            }
            else {
                outcomes[pos] = horseTakesKing(board, newkoni, newkonj, cari, carj);
            }
            //if new coordinate is ' ' - return recursive call for new coordinate
        }
        boolean outcome = false;
        for (int i = 0; i < outcomes.length; i++) {
            if(outcomes[i]){
                outcome = true;
                break;
            }
        }
        return outcome;
    }
}
