package HW1;

import java.util.ArrayList;

public class AutomatHotDrinks extends AutomatOfDrinks {
    public AutomatHotDrinks(ArrayList<HotDrink> listProduct) {
        super(listProduct);
    }

    @Override
    public void getProduct(String name, double volume, int temperature) {

        for (int i = 0; i < hotDrinks.size(); i++) {
            if (hotDrinks.get(i).getTradeMark().equals(name)) {
                if (hotDrinks.get(i).getVolume() == volume) {
                    if (hotDrinks.get(i).getTemperature() == temperature) {
                        hotDrinks.get(i).showParam();
                    }
                }
            }
        }
    }
}