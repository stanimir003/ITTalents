package Notepad;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Page page1 = new Page("Яката страница");
        Page page2 = new Page("не толкова яка страница");

        SimpleNotepad notepad = new SimpleNotepad("kjnlckm");
        SecuredNotepad securedNotepad = new SecuredNotepad("kkkkk","hkdjxcmn");






        String jjj = "jdkflkcxvm2 hhh";
        page1.addText(jjj);
        String hhh = "dofkxcxcvmk";
        page2.addText(hhh);

        notepad.pages[0] = page1;
        notepad.pages[1] = page2;

        securedNotepad.pages[0] = page1;
        securedNotepad.pages[1] = page2;


        securedNotepad.addTextinPage(0,"fdk","sdv");
        securedNotepad.addTextAndDeleteOld(0,"scx","xcv ");
        securedNotepad.deleteText(0,"dxz");
        securedNotepad.showAllPages("cxvsd5");

        securedNotepad.addTextAndDeleteOld(0,"sddss","sd");
        securedNotepad.showAllPages("vxc");


        notepad.showAllPages();
        notepad.addTextinPage(1,hhh);
        notepad.addTextAndDeleteOld(1,"gggggggg");
        notepad.deleteText(0);
        notepad.showAllPages();
        notepad.pages[1].containsDigits();
        notepad.pages[0].searchWord("hhh");
        notepad.searchWord("hhh" , "cx");
        notepad.printAllPagesWithDigits("cx");


    }
}
