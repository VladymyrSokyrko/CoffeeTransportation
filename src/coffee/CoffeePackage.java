package coffee;

public class CoffeePackage {
    private Coffee coffee;
    private Tare tare;

    public Coffee getCoffee() {
        return coffee;
    }

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public Tare getTare() {
        return tare;
    }

    public void setTare(Tare tare) {
        this.tare = tare;
    }

    public Double getCoffeePackagePrice (){
        return coffee.getPrice() * tare.getWeight();
    }
}
