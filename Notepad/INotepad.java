package Notepad;

public abstract class INotepad  {

    Page page;

    abstract void searchWord(String word , String passs);

    abstract void printAllPagesWithDigits(String passs);


    /*abstract String addTextinPage(int x, String textt);

    abstract String addTextAndDeleteOld(int x, String texttt);

    abstract void deleteText(int x);

    abstract void showAllPages();
*/


}
