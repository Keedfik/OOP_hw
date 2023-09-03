import java.util.ArrayList;
import java.util.List;

import Domen.Product;
import Domen.HotDrink;
import Services.CoinDispenser;
import Services.Holder;
import Services.VendingMachine;


public class App {
    public static void main(String[] args) throws Exception {
        List<Product> assort = new ArrayList<Product>();

        Product item1 = new Product("Lays", 100);
        Product item2 = new Product("Cola", 50);
        HotDrink item3 = new HotDrink("Tea", 30, 50);
        HotDrink item4 = new HotDrink("Coffee", 50, 60);
        
        assort.add(item1);
        assort.add(item2);
        assort.add(item3);
        assort.add(item4);

        Holder hold1 = new Holder(10, 10);
        CoinDispenser disp1 = new CoinDispenser(120);

        VendingMachine venmach1 = new VendingMachine(hold1, disp1, assort);

        for(Product prod: venmach1.getProductList()){
            System.out.println(prod);
        }

    }
}
