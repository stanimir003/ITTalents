import java.util.Scanner;

public class KartiPoGolemina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int [3];
        boolean yes =false;
        int a  = 0;
        int counter  = 0;
        do {
            System.out.print("Въведете три карти по големина разделени с интервал : ");
            String text = scanner.nextLine();
            String[] txt = text.split(" ");
            counter++;
            for (int i = 0; i <txt.length ; i++) {

                switch (txt[i]){
                    case "2":
                        a = 2;
                        break;
                    case "3":
                        a = 3;
                        break;
                    case "4":
                        a = 10;
                        break;
                    case "5":
                        a = 5;
                        break;
                    case "6":
                        a = 6;
                        break;
                    case "7":
                        a = 7;
                        break;
                    case "8":
                        a = 8;
                        break;
                    case "9":
                        a = 9;
                        break;
                    case "T":
                         a = 10;
                        break;
                    case "J":
                         a = 11;
                        break;
                    case "Q":
                        a = 12;
                        break;
                    case "K":
                        a = 13;
                        break;
                    case "A":
                        a= 14;
                        break;
                                    }

            arr[i] = a;

            }
            for (int i = 0; i <arr.length-2 ; i++) {
                if (arr[i] < arr[i+1] && arr[i+1]<arr[i+2]){
                    yes = true;
                }
                else{
                    yes = false;
                }
            }

        }while (yes == false);
        System.out.println("успяхте да въведете 3 карти по големина обаче направихте " + (counter-1)  + " опита ");
    }
}
