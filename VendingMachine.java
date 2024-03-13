import java.util.List;

public interface VendingMachine {

    void initProducts(List<Product> productList);

    Product getProduct(String name);

}
