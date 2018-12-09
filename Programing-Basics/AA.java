import java.util.Scanner;

public class AA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean yes = false;
        int counter = 0;
        do{
            System.out.println("Vuvedete dve kart razdeleni sus speis ----> ");
            String text = scanner.nextLine();
            String[] txt = text.split(" ");
            for (int i = 0; i <txt.length ; i++) {
                if (txt[i].equals("2") ||txt[i].equals("3") ||txt[i].equals("4") ||txt[i].equals("5") ||txt[i].equals("6") || txt[i].equals("7") ||txt[i].equals("8") ||txt[i].equals("9") ||txt[i].equals("T") ||txt[i].equals("J") ||txt[i].equals("Q") ||txt[i].equals("K") ||txt[i].equals("A")  ){
                    if (txt[i].equals("A")){
                        yes = true;
                    }
                    else {
                        yes = false;
                    }
                }else{
                    yes =false;
                    System.out.println("vuvejdaneto e greshno");
                }

            }
            counter++;
            if (yes){
                System.out.println("Number of tries : " + (counter-1));
                break;
            }

        }while (true);
    }
}
