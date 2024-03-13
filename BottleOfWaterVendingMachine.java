import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine {
    private List<Product> productList;

    @Override
    public void initProducts(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product el : productList) {
            if (el.getName().equals(name))
                return el;
        }
        return null;
    }

    public Product getProduct(String name, double volume) {
        for (Product el : productList) {

            if (el.getName().equals(name) && ((BottleOfWatter) el).getVolume() == volume)
                return el;
        }
        return null;
    }
}
