import java.util.*;

record Person(String name, int age) {}

class RecordDemo {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
            new Person("Alice", 20),
            new Person("Bob", 15)
        );

        list.stream()
            .filter(p -> p.age() >= 18)
            .forEach(System.out::println);
    }
}