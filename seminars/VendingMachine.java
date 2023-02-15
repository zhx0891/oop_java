package seminars;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    public VendingMachine(ArrayList<Product> products){
        this.productList = products;

    }
    private ArrayList<Product> productList;




    Product getProductByName(String aName){
        Product res = null;
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getName() == aName){
                res = productList.get(i);
            }
        }
        return res;
    }


    Product getProductByCost(double aCost){
        Product res = null;
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getCost() == aCost){
                res = productList.get(i);
            }
        }
       return res;
    }
}
//Roman: Реализуйте класс Товар, содержащий данные о товаре, и
// ТорговыйАвтомат, содержащий в себе методы initProducts (List <Product>)
// сохраняющий в себе список исходных продуктов и getProduct(String name)
// Реализовать конструкторы, get/set методы, построить логику ТорговогоАвтомата
// на основе кода сделанного в задании 1.2
// Сделать класс Товар абстрактным, создать нескольких наследников
// (к примеру: БутылкаВоды),
// сделать интерфейсом ТорговыйАвтомат и реализовать класс какого-то одного типа
// ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат
// Попросить вначале переопределить метод toString для Товара,
// запустить программу, после этого переопределить для наследника этот метод,
// после запуска обратить внимание на изменение поведения. (10 минут)
// Попросить создать перегруженный метод выдачи товара ТорговымАвтоматом
// дополнив дополнительным входным параметром
// (пример: getProduct(String name) выдающий товар по имени,
// создать метод возвращающий товар по имени и какому-либо параметру
// товара getProduct(String name, int volume) (10 минут)
