import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product b1 = new BottleOfWatter("1", 1, 1);
        Product b2 = new BottleOfWatter("2", 2, 2);
        Product b3 = new BottleOfWatter("5", 4, 0.33);
        Product b4 = new BottleOfWatter("15", 0.5, 1);
        Product b5 = new BottleOfWatter("20", 6, 1.5);
        Product tea1 = new HotDrink("999", 0.2, 90, 1);
        Product tea2 = new HotDrink("777", 0.3, 92, 1);
        Product tea3 = new HotDrink("555", 0.4, 95, 1);
        List<Product> productList = new ArrayList<>();
        List<Product> productListForHotDrink = new ArrayList<>();

        productList.add(b1);
        productList.add(b2);
        productList.add(b3);
        productList.add(b4);
        productList.add(b5);
        productListForHotDrink.add(tea1);
        productListForHotDrink.add(tea2);
        productListForHotDrink.add(tea3);

        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine();
        vendingMachine.initProducts(productList);

        VendingMachineHotDrink vendingMachine2 = new VendingMachineHotDrink();
        vendingMachine2.initProducts(productListForHotDrink);

        System.out.println(vendingMachine.getProduct("15", 0.5));
        System.out.println(vendingMachine2.getProduct1("555", 95, 0.4));
    }

}
