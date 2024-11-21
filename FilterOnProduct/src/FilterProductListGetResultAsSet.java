import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterProductListGetResultAsSet {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1,"Sony Mobile",25000));
        productList.add(new Product(2,"Lenovo Mobile",15000));
        productList.add(new Product(3,"Nokia Mobile",10000));
        productList.add(new Product(4,"Samsung Mobile", 40000));
        productList.add(new Product(5,"Mi Mobile",10000));

        Set<Integer> productPriceSet = productList.stream()
                .filter(p -> p.getPrice() < 20000) //filter product on the base of price
                .map(p -> p.getPrice())
                .collect(Collectors.toSet()); //collect it as a set(Remove duplicates)

        System.out.println(productPriceSet);
    }
}
