import java.util.List;

public class VendingMachineHotDrink extends BottleOfWaterVendingMachine {
    private List<Product> productListForHotDrink;

    @Override
    public void initProducts(List<Product> productListFo) {
        this.productListForHotDrink = productListFo;
    }

    public Product getProduct1(String name, int temperature, double volume) {
        for (Product el : productListForHotDrink) {
            if (el.getName().equals(name) && (((HotDrink) el).getTemperature() == temperature)
                    && (((HotDrink) el).getVolume() == volume))
                return el;
        }
        return null;
    }
}
