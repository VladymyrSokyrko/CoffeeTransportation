package wagon;

import coffee.Box;
import exception.LimitSizeException;

import java.util.ArrayList;

public class Wagon {
    private String name;
    private Double maxWeight;
    private Double capacity;
    private ArrayList<Box> boxes = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public double getCapacityRemain () {
        double capacityRemain = this.capacity;
        for (Box box:
             boxes) {
            capacityRemain -= box.boxCapacity();
        }
        return capacityRemain;
    }

    public double getWeightRemain () {
        double weightRemain = this.maxWeight;
        for (Box box:
                boxes) {
            weightRemain -= box.getMaxWeight();
        }
        return weightRemain;
    }

    public void addBox (Box box){
        if (box.boxCapacity()< getCapacityRemain() && box.getBoxWeight() < getWeightRemain()){
            boxes.add(box);
        }
        else throw new LimitSizeException();


        //To do: getPrice
    }

    public double getPrice (){
        double price = 0;
        for (Box box:
                boxes){
            price += box.getBoxPrice();
        }
        return price;
    }
}
