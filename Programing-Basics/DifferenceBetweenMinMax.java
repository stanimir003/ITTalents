public class DifferenceBetweenMinMax {
    public static void main(String[] args) {
        int [] arr = {3,2,5,6,7,1,2,99,1};
        int i =0;
        int difference;
        int min = arr[0];
        int max = arr[0];
         difference =differenceBetweenMinMax(arr,i,0,min,max);
        System.out.println(difference);
    }

    static int differenceBetweenMinMax(int [] arr,int i,int difference,int min,int max){
       if (i == arr.length){
           difference = max -min;
           return difference;
       }if (arr[i]>max){
           max =arr[i];
        }
        if (arr[i]<min){
            min =arr[i];
        }

        return differenceBetweenMinMax(arr,i+1,difference,min,max);
    }
}
