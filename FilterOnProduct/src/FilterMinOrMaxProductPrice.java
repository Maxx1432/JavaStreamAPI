import java.util.ArrayList;
import java.util.List;

public class FilterMinOrMaxProductPrice {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1,"Sony Mobile",25000));
        productList.add(new Product(2,"Lenovo Mobile",15000));
        productList.add(new Product(3,"Nokia Mobile",10000));
        productList.add(new Product(4,"Samsung Mobile", 40000));

        Product maxPriceProduct = productList.stream()
                .max((p1,p2) -> p1.getPrice() > p2.getPrice() ? 1 : -1)
                .get();

        System.out.println("Product which has max price "+maxPriceProduct);

        Product minPriceProduct = productList.stream()
                .min((p1,p2)-> p1.getPrice() > p2.getPrice() ? 1 : -1)
                .get();

        System.out.println("Product which has min price "+minPriceProduct);
    }
}
