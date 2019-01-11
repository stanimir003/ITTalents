package WorkInWarehouse;

public class demo {

    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        Shop shop = new Shop();
        /*
        warehouse.ShowProducts();
        warehouse.Dostavka();
        warehouse.ShowProducts();
        warehouse.vzemaneNaProdukt("Banana");
        warehouse.ShowProducts();
        warehouse.vzemaneNaProdukt("Banana");
        warehouse.ShowProducts();
*/
        shop.ShowProducts();
        shop.buy("Banana",5);
        shop.ShowProducts();
        shop.buy("Banana",5);
        shop.ShowProducts();
        warehouse.ShowProducts();

    }
}
