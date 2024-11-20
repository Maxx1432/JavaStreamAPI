import java.util.ArrayList;
import java.util.List;

public class FilterSumOfAllProductPrice {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1,"Sony Mobile",25000));
        productList.add(new Product(2,"Lenovo Mobile",15000));
        productList.add(new Product(3,"Nokia Mobile",10000));
        productList.add(new Product(4,"Samsung Mobile", 40000));

        int totalPrice1 = productList.stream()
                        .map(p -> p.getPrice())
                .reduce(0,(sum, price)-> sum + price); // accumulating price
        System.out.println(totalPrice1);

        int totalPrice2 = productList.stream()
                .map(p -> p.getPrice())
                .reduce(0,Integer::sum); //accumulating price, by referring method of Integer class

        System.out.println(totalPrice2);
    }
}
