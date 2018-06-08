package godel.lambda;

import java.util.List;

public class PersonProcessor {

    public void process(List<Person> data, Filter filter, Printer printer) {
        for (Person person : data) {
            if (filter.match(person)) {
                printer.print(person);
            }
        }
    }
}
