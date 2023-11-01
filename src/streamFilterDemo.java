import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamFilterDemo {
    public static void main(String [] args){
        List<String> nameList = Arrays.asList("Ram","Peter","Pradeep","Steve");

        Stream<String> stream = nameList.stream();

        stream = stream.filter(name -> name.startsWith("P"));

        List<String> filteredNameList = stream.collect(Collectors.toList());
        filteredNameList.forEach(System.out ::println);
    }
}
