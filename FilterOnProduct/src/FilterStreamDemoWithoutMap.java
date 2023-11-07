import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
    Filtering collection With using Stream
 */
public class FilterStreamDemoWithoutMap {
    public static void main(String [] args){
        List<Product> productList = new ArrayList<>();

//        Adding Products
        productList.add(new Product(1,"Sony Mobile",25000));
        productList.add(new Product(2,"Lenovo Mobile",15000));
        productList.add(new Product(3,"Nokia Mobile",10000));
        productList.add(new Product(4,"Samsung Mobile", 40000));

        List<String> filteredProductList = new ArrayList<>();

        for(Product product : productList) {
            /*
            * Filter product based on product price less than 20000
            * add the product name in filteredList
            * */

            if (product.getPrice() < 20000 ){
                filteredProductList.add(product.getName());
            }
        }

        System.out.println(filteredProductList);

    }
}
