package seminars;

import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args) {
        ArrayList<Product> productsList = new ArrayList<>();
        Product prod1 = new Product("soda", 3.60);
        productsList.add(prod1);
        Product prod2 = new Product("soda1", 3.50);
        productsList.add(prod2);
        Product prod3 = new Product("soda2", 3.40);
        productsList.add(prod3);
        Product prod4 = new Product("soda3", 3.70);
        productsList.add(prod4);
        VendingMachine machine = new VendingMachine(productsList);
    }
}
