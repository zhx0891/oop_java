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


