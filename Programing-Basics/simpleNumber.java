import java.util.Scanner;

public class simpleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            boolean isPrime = true;
            System.out.print("Въведете число ");
            int m =scanner.nextInt();
            if (m==1){
                System.out.println("Числото ти е 1 ");
                break;
            }else {
                for (int i = 2; i <m ; i++) {
                    if (m % i ==0){
                        isPrime = false;
                        break;

                    }
                }
                if(isPrime){
                    System.out.println("Prime!");
                }
                else{
                    System.out.println("Not prime!");
                }
            }


        }while(true);
    }
}
