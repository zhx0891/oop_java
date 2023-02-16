package seminars;

public class Product {
    private String name;
    private double cost;
    public Product(String aName, double aCost){
        this.name = aName;
        this.cost = aCost;
    }

    String getName(){
        return this.name;
    }
    double getCost(){
        return this.cost;
    }
    void setName(String aName){
        this.name = aName;
    }
    void setCost(double aCost){
        this.cost = aCost;
    }
}
