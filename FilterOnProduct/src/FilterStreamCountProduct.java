import java.util.ArrayList;
import java.util.List;

public class FilterStreamCountProduct {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1,"Sony Mobile",25000));
        productList.add(new Product(2,"Lenovo Mobile",15000));
        productList.add(new Product(3,"Nokia Mobile",10000));
        productList.add(new Product(4,"Samsung Mobile", 40000));

        long count = productList.stream().filter(p -> p.getPrice() < 20000).count();

        System.out.println("Product with price greater than 20000 : "+count);
    }
}
