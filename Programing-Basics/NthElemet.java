import java.util.Scanner;

public class NthElemet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {3, 5, 22, 11, 55, 0, 6,33,555,6666,4};
        int n = scanner.nextInt();
        for (int SourtedCount = 1; SourtedCount < arr.length; SourtedCount++) {
            int maxIndex = 0;
            for (int index = 0; index <= arr.length - SourtedCount; index++) {
                if (arr[index] > arr[maxIndex]) {
                    maxIndex = index;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[arr.length - SourtedCount];
            arr[arr.length - SourtedCount] = temp;

        }
        int counter = 0;
        for (int i =arr.length-1; i >0 ; i--) {
            if (arr[i] != arr[i-1] ){
                counter++;
            }
            if (counter == n){
                System.out.println(n + "тия най голям елемент е " + arr[i] );
                }
            }
        }
    }


