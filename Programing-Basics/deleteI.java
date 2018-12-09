import java.util.Scanner;

public class deleteI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = " I love programing";
        String txt = scanner.nextLine();
        String corentText = text.replace(txt,"");
        System.out.println(corentText);
        }


    }

