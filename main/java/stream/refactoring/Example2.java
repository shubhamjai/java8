package main.java.stream.refactoring;

import main.java.entity.Person;
import main.java.util.PersonUtil;

import java.util.List;

public class Example2 {
    public static void main(String... args) {
        List<Person> personList = PersonUtil.getPersonList();
        personList.stream()
                .filter(person -> isValidAge(person))
                .map(person -> getCombinedName(person))
                .forEach(value -> System.out.println(value));
    }

    private static String getCombinedName(Person person) {
        return person.getFirstName() + person.getLastName();
    }

    private static boolean isValidAge(Person person) {
        return person.getAge() > 30;
    }
}
