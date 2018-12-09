public class JavaTask4Sudoku {
    public static void main(String[] args) {

        int[][] matrix = {
                {2, 4, 6,7,5,3,8,9,1},
                {3, 2, 6,3,4,1,5,6,7},
                {1, 5, 4,6,7,8,1,2,3},
                {4, 4, 1,4,1,3,8,9,1},
                {5, 2, 6,3,4,1,5,6,7},
                {6, 5, 4,6,7,8,1,2,3},
                {7, 4, 1,4,1,3,8,9,1},
                {8, 2, 6,3,4,1,5,6,7},
                {9, 5, 4,6,7,8,1,2,3}
        };
       // validNumbers(matrix);
        // validRows(matrix);
       // validCols(matrix);
    }

    static void validNumbers(int[][] matrix) {
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 1 || matrix[i][j] > 9) {
                    System.out.println("имате число извън диапазона и се на мира на позиция : " + (i + 1) + " " + (j + 1));
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("всички цифри са в диапазона");
        }
    }

    static void validRows(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int counter =1;
            for (int col = 0; col < matrix[row].length; col++) {
                for (int i = col + 1; i < matrix[row].length; i++) {
                    if (matrix[row][col] == matrix[row][i]) {
                        System.out.println("имате еднакви числа на ред " + (row + 1));
                        counter++;
                        break;

                    }
                }
                if (counter>1){
                    break;
                }
            }
        }
    }

    static void validCols(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int counter=1;
            for (int col = 0; col < matrix[row].length; col++) {
                for (int i = col + 1; i < matrix[col].length-1; i++) {
                    if (matrix[col][row] == matrix[col][i]) {
                        System.out.println("имате еднакви числа на колона " + (row +1));
                        counter++;
                        break;
                    }
                }
                if (counter>1){
                    break;
                }
            }
        }
    }
}
