package Notepad;

public class Page {

    String title;
    String text;

    public Page(String title) {
        this.title = title;
    }

    String addText(String text) {
        this.text = text;
        return this.text;
    }

    String deleteText() {
        this.text = this.text.replace(text, "");
        return this.text;
    }

    void showText() {
        System.out.println(this.title);
        System.out.println(this.text);
    }

    void searchWord(String word){
        if (this.text.contains(word)){
            System.out.println("Думата се съдържа в текста");
        }
        else {
            System.out.println("Думата не се съдържа в текста");
        }
    }

    void containsDigits(){
        boolean numbers =false;
        for (int i = 0; i <this.text.length() ; i++) {
            if (this.text.charAt(i)  >='1' && this.text.charAt(i) <='9'){
                numbers = true;
                break;

            }
            else{
                numbers =false;
            }
        }
        if (numbers){
            System.out.println("в текста има цифри");
        }
        else{
            System.out.println("в текста нама цифри");
        }
    }
}