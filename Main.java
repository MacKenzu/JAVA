package task_1;

import java.util.ArrayList;
import java.util.List;

import task_1.domen.Bottle;
import task_1.domen.HotDrinks;
import task_1.domen.product;
import task_1.service.CoinDispenser;
import task_1.service.Display;
import task_1.service.Holder;
import task_1.service.VendingMachine;

public class Main {
    public static void main(String[] args) {
        product items1 = new product("lays", 0, 100, "snack");
        product items2 = new product("twix", 1, 20, "chocolade");
        product items3 = new product("nuts", 2, 300, "nuts");
        product items4 = new Bottle("cola", 4, 400, "drinks", 0.5);
        product items5 = new HotDrinks("tie", 4, 400, "drinks", 0.5, 95 );
        product items6 = new HotDrinks("Coffee", 4, 400, "drinks", 0.5, 99 );
        List <product> assort = new ArrayList<>();
        assort.add(items1);
        assort.add(items2);
        assort.add(items3);
        assort.add(items4);
        assort.add(items5);
        assort.add(items6);
        Holder holder = new Holder();
        CoinDispenser coinDispenser = new CoinDispenser();
        Display display = new Display();
        VendingMachine vendingMachine = new VendingMachine(holder, coinDispenser, display, assort);
        for (product product : vendingMachine.getAssort()) {
         System.out.println(product);
            
        }
        
        }

    }
    

