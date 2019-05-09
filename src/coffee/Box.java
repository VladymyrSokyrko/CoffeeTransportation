package coffee;

import java.util.ArrayList;
import exception.*;

public class Box {
    private String name;
    private ArrayList<CoffeePackage> coffeePackages = new ArrayList<>();
    private Double length;
    private Double width;
    private Double height;
    private Double maxWeight;

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPackage (CoffeePackage coffeePackage) {
        if (coffeePackages.size() < getCapacity(coffeePackage)){
            coffeePackages.add(coffeePackage);
        }
        else
            throw new LimitSizeException ();
    }

    public void fillBox (CoffeePackage coffeePackage){
       while (coffeePackages.size() < getCapacity(coffeePackage)){
           addPackage(coffeePackage);
        } 
    }



    public int  checkFreeSpace (){
        return 0;
    }

    public int getCapacity (CoffeePackage coffeePackage){
        int lengthCapacity = (int)(this.length/coffeePackage.getTare().getLength());
        int heightCapacity = (int) (this.height/coffeePackage.getTare().getHeight());
        int widthCapacity = (int) (this.width/coffeePackage.getTare().getWidth());
        int capacity = lengthCapacity * heightCapacity *  widthCapacity;
        return capacity;
    }

    public Double boxCapacity (){
      return this.height * this.length * this.maxWeight;
    }

    public Double getBoxPrice (){
        double boxPrice = 0.0;
        for (CoffeePackage coffeePackage: coffeePackages) {
            boxPrice += coffeePackage.getCoffeePackagePrice();
        }
        return boxPrice;
    }

    public double getBoxWeight () {
        double boxWeight = 0.0;
        for (CoffeePackage coffeePackage: coffeePackages) {
            boxWeight += coffeePackage.getTare().getWeight();
        }
        return boxWeight;
    }
}
