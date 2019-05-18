import coffee.Coffee;
import wagon.Wagon;
import wagon.WagonFactory;

public class Main {

    public static void main(String[] args) {

        WagonFactory factory = new WagonFactory();

        Wagon wagon = factory.wagonConstructor();

        System.out.println(wagon.getPrice());



    }
}
