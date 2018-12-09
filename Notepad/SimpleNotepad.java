package Notepad;

public  class SimpleNotepad  extends INotepad{

    Page [] pages = new Page[2];

    protected String notepadName;

    public SimpleNotepad(String name) {
        this.notepadName= name;
    }

    void showSimpleNotepadName(){
        System.out.println(this.notepadName);
    }


    String addTextinPage(int x , String textt) {
       return pages[x].text = pages[x].addText(textt);
    }


    String addTextAndDeleteOld(int x,String texttt) {
        pages[x].deleteText();
        return pages[x].text = pages[x].addText(texttt);

    }


    void deleteText(int x) {
        pages[x].deleteText();
    }


    void showAllPages() {
        for (int i = 0; i <pages.length ; i++) {
            System.out.println("Страница " + (i+1));
            pages[i].showText();
        }
    }

    @Override
    void searchWord(String word,String pass) {
        for (int i = 0; i <pages.length ; i++) {
            if (this.pages[i].text.contains(word)){
                System.out.println("Думата се съдържа в текста на страница " + (i+1) );
            }
            else {
                System.out.println("Думата не се съдържа в текста на страница " + (i+1));
            }
        }
    }

    @Override
    void printAllPagesWithDigits(String pass) {
        for (int i = 0; i <pages.length ; i++) {
            boolean numbers =false;
            for (int j = 0; j <this.pages[i].text.length() ; j++) {
                if (this.pages[i].text.charAt(j)  >='1' && this.pages[i].text.charAt(j) <='9'){
                    numbers = true;
                    break;

                }
                else{
                    numbers =false;
                }
            }
            if (numbers){
                System.out.println("в текста има цифри на страница " + (i+1));
            }
            else{
                System.out.println("в текста нама цифрина страница " + (i+1));
            }
        }
    }


}
