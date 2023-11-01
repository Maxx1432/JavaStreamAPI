import java.util.Arrays;
import java.util.List;

public class FilterDemo1 {
    public static void main(String [] args) {
        List<Person> personList = Arrays.asList(new Person(1,"Ram",25),
                new Person(2,"Peter",31),
                new Person(3,"Steve",25),
                new Person(4,"Balu",32));
        FilterDemo1 filterDemo = new FilterDemo1();
        Person person = filterDemo.getStudentByNameAndAge(personList,"Peter",31);
        System.out.println(person);
    }

    private Person getStudentByNameAndAge(List<Person> personList, String name, int age) {

        Person tempPerson = null;
        for(Person person : personList) {
            if(name.equals(person.getName()) && person.getAge() == age){
                tempPerson = person;
            }
        }
    return tempPerson;
    }
}
