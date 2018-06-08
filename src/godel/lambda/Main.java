package godel.lambda;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Petr", "petr@godeltech.com", "developer", 24),
                new Person("Evgeniy", "evg@mail.com", "manager", 18),
                new Person("Thanos", "thanos@titanov.net", "dark lord", 5_000)
        );

        Filter filter = (Person person) -> "developer".equals(person.getPosition()) || person.getAge() > 20;
        Printer printer = (Person person) -> System.out.println(person.getName());
        PersonProcessor processor = new PersonProcessor();
        processor.process(personList,filter,printer);

    }

}
