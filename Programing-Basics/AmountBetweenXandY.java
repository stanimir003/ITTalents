import java.util.Scanner;

public class AmountBetweenXandY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] arr ={2,5,8,0,1,3,6,7,9,2,3,1,55,66,7,1};
        System.out.println("vuvedete X");
        int x = scanner.nextInt();
        System.out.println("Vyvedete Y");
        int y = scanner.nextInt();
        if (y < x){
            int temp =y;
            y = x;
            x =temp;
        }
        int sum;
        int result = AmountBetweenXAndY(arr,x,y,0,0);
        System.out.println(result);
    }
    static int AmountBetweenXAndY(int [] arr,int x,int y,int i,int sum){
        if (i == arr.length){
            return sum;
        }
        if (arr[i] < x || arr[i]>y){
            sum+=arr[i];
        }
        return AmountBetweenXAndY(arr,x,y,i+1,sum);
    }
}
