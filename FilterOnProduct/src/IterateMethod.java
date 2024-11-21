import java.util.stream.Stream;

public class IterateMethod {
    public static void main(String[] args) {
        Stream.iterate(1,element->element + 1)
                .filter(element -> element % 10 == 0)
                .limit(5)
                .forEach(System.out::println);
    }
}
