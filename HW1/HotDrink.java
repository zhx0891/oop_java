package HW1;

public class HotDrink {
    private String tradeMark;
    private String volume;
    private int temperature;

    public HotDrink(String aTradeMark, String aVolume, int aTemperature){
        this.temperature = aTemperature;
        this.tradeMark = aTradeMark;
        this.volume = aVolume;
    }
    void showParam(){
        System.out.println(this.tradeMark +"\n"+
                           this.volume +"\n"+
                           this.temperature);
    }
    String getTradeMark(){
        return this.tradeMark;
    }
    String getVolume(){
        return this.volume;
    }
    int getTemperature(){
        return this.temperature;
    }

}

//    Создать наследника реализованного класса ГорячийНапиток с дополнительным
//    полем int температура.
//    Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и
//    реализовать перегруженный метод
//    getProduct(int name, int volume, int temperature)
//    выдающий продукт соответствующий имени, объему и температуре
//    В main проинициализировать несколько ГорячихНапитков и
//    ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
//    Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
//
//
