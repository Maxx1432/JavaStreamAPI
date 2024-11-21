import java.util.ArrayList;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

public class FilterSumOfAllProductPriceUsingCollectors {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1,"Sony Mobile",25000));
        productList.add(new Product(2,"Lenovo Mobile",15000));
        productList.add(new Product(3,"Nokia Mobile",10000));
        productList.add(new Product(4,"Samsung Mobile", 40000));

        LongSummaryStatistics longSummaryStatistics = productList.stream()
                .collect(Collectors.summarizingLong(p -> p.getPrice()));

        System.out.println(longSummaryStatistics);
        System.out.println("count "+longSummaryStatistics.getCount());
        System.out.println("sum "+longSummaryStatistics.getSum());
        System.out.println("Min "+longSummaryStatistics.getMin());
        System.out.println("Average "+longSummaryStatistics.getAverage());
        System.out.println("Max "+longSummaryStatistics.getMax());

    }
}
