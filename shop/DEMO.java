package SHOP;

public class DEMO {
    public static void main(String[] args) {

        shop MyShop = new shop("Lidl","Mladost1");
        Client client = new Client(MyShop,500,50);

        client.pokupkaNaBroika("book",5);
        client.pokupkaNaKilogram("fish",5);
        System.out.println(MyShop.money);
        System.out.println(client.myMoney);
        System.out.println(MyShop.kolichestvaZaBroi.entrySet());
        client.pokupkaNaBroika("book",2);
        System.out.println(client.kolichkataMi);
        client.plashtane();
        System.out.println(MyShop.money);
        System.out.println(client.myMoney);

    }
}
