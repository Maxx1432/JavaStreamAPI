import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
    Filtering collection With using Stream
 */
public class FilterStreamDemo {
    public static void main(String [] args){
        List<Product> productList = new ArrayList<>();

//        Adding Products
        productList.add(new Product(1,"Sony Mobile",25000));
        productList.add(new Product(2,"Lenovo Mobile",15000));
        productList.add(new Product(3,"Nokia Mobile",10000));
        productList.add(new Product(4,"Samsung Mobile", 40000));

        List<Product> filteredProductList = productList.stream()
                .filter(product -> product.getPrice() < 20000) // Filter the products whose price less than 20000
                .collect(Collectors.toList()); // Collect the result in a list

        filteredProductList.forEach(product -> System.out.println(product));

    }
}
