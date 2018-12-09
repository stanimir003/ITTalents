package Notepad;

import java.util.Scanner;

public class SecuredNotepad extends INotepad  {
    Scanner scanner = new Scanner(System.in);

    Page [] pages = new Page[2];



    protected String notepadName;
    private String pass = setPas();


    String setPas(){
        boolean capitalLatters;
        boolean lowercaseLetters;
        boolean numbers;
        String pas;
        do {
            System.out.println("въведете паролата ");
             pas = scanner.nextLine();

            capitalLatters = false;
            lowercaseLetters = false;
            numbers = false;
            for (int i = 0; i <pas.length() ; i++) {
                if (pas.charAt(i) >= 'A' && pas.charAt(i) <='Z' && pas.length() >=5 ){
                    capitalLatters =true;
                }
                if (pas.charAt(i) >= 'a' && pas.charAt(i) <='z' && pas.length() >=5){
                    lowercaseLetters = true;
                }

                if (pas.charAt(i) >= '1' && pas.charAt(i) <='9' && pas.length() >=5){
                    numbers = true;
                }
            }

            if (capitalLatters == false){
                System.out.println("НЯМАШ ГЛАВНА БУКВА В ПАРОЛАТА");
            }
            if (lowercaseLetters == false){
                System.out.println("НЯМАШ МАЛКИ БУКВИ ВПАРОЛАТА");
            }
            if (numbers== false){
                System.out.println("НЯМАШ ЦИФРИ В ПАРОЛАТА");
            }



        }while(capitalLatters == false&&lowercaseLetters == false&&numbers == false);

        return pas;
    }

    public SecuredNotepad(String notepadName, String pass) {
        this.notepadName = notepadName;
        this.pass = pass;
    }


    public String getPass() {
        return this.pass;
    }

    public String setPass(String pass) {
        this.pass = pass;
        return this.pass;
    }


    void showSimpleNotepadName(){
        System.out.println(this.notepadName);
    }



    String addTextinPage(int x , String textt,String passs) {
        String pas;
        if (this.getPass().equals(passs)) {
            return pages[x].text = pages[x].addText(textt);
        }else {
            pas = "Паролата е грешна";
            System.out.println("Паролата е грешна");
            return pas;
        }

    }


    String addTextAndDeleteOld(int x,String texttt,String passs) {
        String pas;
        if (this.getPass().equals(passs)) {
        pages[x].deleteText();
        return pages[x].text = pages[x].addText(texttt);
        }else {
            pas = "Паролата е грешна";
            System.out.println("Паролата е грешна");
            return pas;
        }
    }


    void deleteText(int x,String passs) {
        String pas;
        if (this.getPass().equals(passs)) {
        pages[x].deleteText();
        }else {
            pas = "Паролата е грешна";
            System.out.println("Паролата е грешна");
        }
    }


    void showAllPages(String  passs) {
        if (this.getPass().equals(passs)) {
            for (int i = 0; i < pages.length; i++) {
                System.out.println("Страница " + (i + 1));
                pages[i].showText();
            }
        }else{
            System.out.println("Паролата е грешна");
        }
    }

    @Override
    void searchWord(String word , String passs) {
    if (this.getPass().equals(passs)){
        for (int i = 0; i <pages.length ; i++) {
            if (this.pages[i].text.contains(word)){
                System.out.println("Думата се съдържа в текста на страница " + (i+1) );
            }
            else {
                System.out.println("Думата не се съдържа в текста на страница " + (i+1));
            }
        }
    }else{
        System.out.println("Паполата е грешна");
    }

    }

    @Override
    void printAllPagesWithDigits(String passs) {
        if (this.getPass().equals(passs)) {
            for (int i = 0; i < pages.length; i++) {
                boolean numbers = false;
                for (int j = 0; j < this.pages[i].text.length(); j++) {
                    if (this.pages[i].text.charAt(j) >= '1' && this.pages[i].text.charAt(j) <= '9') {
                        numbers = true;
                        break;

                    } else {
                        numbers = false;
                    }
                }
                if (numbers) {
                    System.out.println("в текста има цифри на страница  " + (i + 1));
                } else {
                    System.out.println("в текста нама цифрина страница  " + (i + 1));
                }
            }
        }
    }
}



