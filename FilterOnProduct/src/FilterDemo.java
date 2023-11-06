import java.util.ArrayList;
import java.util.List;

/*
    Filtering collection Without using Stream
 */
public class FilterDemo {
    public static void main(String [] args){
        List<Product> productList = new ArrayList<>();

//        Adding Products
            productList.add(new Product(1,"Sony Mobile",25000));
            productList.add(new Product(2,"Lenovo Mobile",15000));
            productList.add(new Product(3,"Nokia Mobile",10000));
            productList.add(new Product(4,"Samsung Mobile", 40000));

            List<Product> filteredProductList = new ArrayList<>();

            for(Product product : productList) {
                /*
                * Filter the product, whose price is less than 2000
                * and add the products in filteredProductList
                * */

                if(product.getPrice() < 20000) {
                    filteredProductList.add(product);
                }
            }

            System.out.println(filteredProductList);
    }

}
