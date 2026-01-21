import java.util.*;

class Person {
    private String name;
    Person(String name) { this.name = name; }
    public String getName() { return name; }
}

class TestPerson {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Amit"),
                new Person("Bhavya"),
                new Person("Chandana")
        );

        people.stream()
                .map(Person::getName)
                .forEach(System.out::println);
    }
}
