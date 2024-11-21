import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertProductListToAMap {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1,"Sony Mobile",25000));
        productList.add(new Product(2,"Lenovo Mobile",15000));
        productList.add(new Product(3,"Nokia Mobile",10000));
        productList.add(new Product(4,"Samsung Mobile", 40000));
        productList.add(new Product(5,"Mi Mobile",10000));

        Map<String, Integer> productMap = productList.stream()
                .collect(Collectors.toMap(p -> p.getName(), p -> p.getPrice()));

        System.out.println(productMap);
    }
}
