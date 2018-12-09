public class FramedWords {
    public static void main(String[] args) {
        String [] mitkoKuciya = {"hello","World","in","a","frame"};

        int maksLength = mitkoKuciya[0].length();
        for (int i = 1; i <mitkoKuciya.length ; i++) {
            if (mitkoKuciya[i].length()>maksLength){
                maksLength=mitkoKuciya[i].length();
            }
        }
        for (int i = 0; i <maksLength+2 ; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i <mitkoKuciya.length ; i++) {
            System.out.print("*");
            for (int j = i; j <mitkoKuciya.length ; j++) {
                System.out.print(mitkoKuciya[j]);
                if (mitkoKuciya[j].length()<maksLength){
                    for (int k = mitkoKuciya[j].length(); k <maksLength ; k++) {
                        System.out.print(" ");
                    }
                }
                break;
            }
            System.out.println("*");
        }
        for (int i = 0; i <maksLength+2 ; i++) {
            System.out.print("*");
        }

    }
}
