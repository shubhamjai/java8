package main.java.stream.refactoring;

import main.java.entity.Person;
import main.java.util.PersonUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example1 {
    public static void main(String... args) {
        List<Person> personList = PersonUtil.getPersonList();
        Map<String, String> mapper = new HashMap<>();

        personList.stream()
                .forEach(person -> System.out.println(getCombinedName(person) + " " + eligibility(person)));

/*
        personList.stream()
                .forEach(person -> mapper.put(getCombinedName(person), eligibility(person)));
        mapper.entrySet()
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
*/


    }

    private static String getCombinedName(Person person) {
        return person.getFirstName() + " " + person.getLastName();
    }

    private static String eligibility(Person person) {
        if (person.getAge() < 18) {

            return "Not eligible for ride: below 18";
        } else if (person.getAge() >= 18 && person.getAge() <= 40) {
            return "Eligible for ride";
        } else {
            return "Not eligible for ride: above 40";
        }
    }
}
