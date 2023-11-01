import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamFilterDemo1 {
    public static void main(String [] args) {
        List<String> nameList = Arrays.asList("Ram","Peter","Pradeep","Steve");

        List<String> filteredList = nameList.stream() //Convert list to stream
                .filter(name->name.startsWith("P")) //filters the name start with "p"
                .collect(Collectors.toList()); // collect the output and convert stream to a List

        filteredList.forEach(System.out::println); //print the element of filtered list
    }
}
