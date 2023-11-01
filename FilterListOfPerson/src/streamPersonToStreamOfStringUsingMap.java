import java.util.Arrays;
import java.util.List;

public class streamPersonToStreamOfStringUsingMap {
    public static void main(String [] args){
        List<Person> personList = Arrays.asList(new Person(1,"Ram",25),
                new Person(2,"Peter",31),
                new Person(3,"Steve",25),
                new Person(4,"Balu",32));

        String person = personList.stream()// convert list to stream
                .map(Person::getName) // Convert Stream<Person> to Stream<String>
                .filter(name -> name.equals("Peter")) // We want "Peter" only
                .findAny() // If findAny then return it
                .orElse(null); // If not found, return null

        System.out.println(person);
    }
}
