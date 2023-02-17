package HW1;

import java.util.ArrayList;

public abstract class AutomatOfDrinks {
    ArrayList<HotDrink> hotDrinks = null;
    public AutomatOfDrinks(ArrayList<HotDrink> listProduct){
        this.hotDrinks = listProduct;
    }

    abstract void getProduct(String name, double volume, int temperature);
}
