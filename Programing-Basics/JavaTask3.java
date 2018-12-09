import java.util.Scanner;

public class JavaTask3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете Х : ");
        int x = scanner.nextInt();

        int [] arr = {2,7,11,8,4,5,6,0,2,5,666};
        array(arr,0,x);

    }
    static  int array(int [] arr,int i,int x){
        if (i == arr.length){
            return i ;
        }
        if (arr[i] > x){
            System.out.print (arr[i] + " ");
        }
        return array(arr,i+1,x);
    }
}
