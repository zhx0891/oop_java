package HW1;

import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args) {
        ArrayList<HotDrink> drinks = new ArrayList<>();
        HotDrink drink1 = new HotDrink("coffee_1", "0.5", 60);
        drinks.add(drink1);
        HotDrink drink2 = new HotDrink("coffee_1", "0.33", 40);
        drinks.add(drink2);
        HotDrink drink3 = new HotDrink("coffee_3", "0.5", 50);
        drinks.add(drink3);
        HotDrink drink4 = new HotDrink("tea", "0.5", 70);
        drinks.add(drink4);
        AutomatHotDrinks automat1 = new AutomatHotDrinks(drinks);
        automat1.getProduct("coffee_1", 0, 40);
    }
}