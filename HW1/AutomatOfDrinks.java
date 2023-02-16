package HW1;

import java.util.ArrayList;

public abstract class AutomatOfDrinks {
    ArrayList<HotDrink> hotDrinks = null;
    public AutomatOfDrinks(ArrayList<HotDrink> listProduct){
        this.hotDrinks = listProduct;
    }
    public HotDrink getProduct(String name, String volume, int temperature){
        for (int i = 0; i < hotDrinks.size(); i++) {
            if(hotDrinks.get(i).getTradeMark().equals(name)){
                if (hotDrinks.get(i).getVolume().equals(volume)){
                    if(hotDrinks.get(i).getTemperature() == temperature){
                        return hotDrinks.get(i);
                    }
                }
            }
        }
        return null;
    }

    abstract void getProduct(String name, int volume, int temperature);
}
