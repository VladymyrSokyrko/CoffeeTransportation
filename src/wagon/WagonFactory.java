package wagon;

import coffee.Box;
import coffee.Coffee;
import coffee.CoffeePackage;
import coffee.Tare;

public class WagonFactory {

    public Wagon wagonConstructor () {
        Wagon firstWagon = new Wagon();
        firstWagon.setCapacity(8600000.00);
        firstWagon.setMaxWeight(5000000.00);

        Coffee arabica = new Coffee();
        arabica.setSort("Arabica");
        arabica.setPrice(0.80);

        Coffee robusta = new Coffee();
        robusta.setSort("Robusta");
        robusta.setPrice(0.50);

        Tare softTare = new Tare();
        softTare.setHeight(20.00);
        softTare.setLength(10.00);
        softTare.setWeight(200.00);
        softTare.setWidth(10.00);

        Tare hardTare = new Tare();
        hardTare.setHeight(30.00);
        hardTare.setLength(20.00);
        hardTare.setWeight(300.00);
        hardTare.setWidth(20.00);

        CoffeePackage softArabicaCoffeePackage = new CoffeePackage();
        softArabicaCoffeePackage.setTare(softTare);
        softArabicaCoffeePackage.setCoffee(arabica);

        CoffeePackage softRobustaCoffeePackage  = new CoffeePackage();
        softRobustaCoffeePackage.setCoffee(robusta);
        softRobustaCoffeePackage.setTare(softTare);

        CoffeePackage hardRobustaCoffeePackage  = new CoffeePackage();
        hardRobustaCoffeePackage.setCoffee(robusta);
        hardRobustaCoffeePackage.setTare(hardTare);

        CoffeePackage hardArabicaCoffeePackage  = new CoffeePackage();
        hardArabicaCoffeePackage.setCoffee(arabica);
        hardArabicaCoffeePackage.setTare(hardTare);

        Box softArabicaCoffeePackageBox = new Box();
        softArabicaCoffeePackageBox.fillBox(softArabicaCoffeePackage);
        Box softRobustaCoffeePackageBox = new Box();
        softRobustaCoffeePackageBox.fillBox(softRobustaCoffeePackage);
        Box hardRobustaCoffeePackageBox = new Box();
        hardRobustaCoffeePackageBox.fillBox(hardRobustaCoffeePackage);
        Box hardArabicaCoffeePackageBox = new Box();
        hardArabicaCoffeePackageBox.fillBox(hardArabicaCoffeePackage);


        softArabicaCoffeePackageBox.setHeight(120.00);
        softArabicaCoffeePackageBox.setLength(120.00);
        softArabicaCoffeePackageBox.setWidth(120.00);
        softArabicaCoffeePackageBox.setMaxWeight(20000.00);

        firstWagon.addBox(softArabicaCoffeePackageBox);
        firstWagon.addBox(softRobustaCoffeePackageBox);
        firstWagon.addBox(hardRobustaCoffeePackageBox);
        firstWagon.addBox(hardArabicaCoffeePackageBox);




        return firstWagon;
    }




}
