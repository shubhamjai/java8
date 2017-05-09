package main.java.part3.iterable;

import main.java.entity.Person;
import main.java.util.PersonUtil;

import java.util.Comparator;
import java.util.List;

public class Example1 {
    public static void main(String args[])
    {
        List<Person> personList = PersonUtil.getPersonList();
        System.out.println("Filter List");
        personList.forEach(System.out::println);

        personList.removeIf(person -> person.getAge() < 25);
        System.out.println("\nFilter List");
        personList.forEach(System.out::println);

        personList.replaceAll(person -> new Person(person.getFirstName().toUpperCase(),person.getLastName().toUpperCase(),person.getAge()));
        System.out.println("\nReplaced List");
        personList.forEach(System.out::println);

        personList.sort(Comparator.comparing(Person::getAge));
        System.out.println("\nSorted PersonList by Age");
        personList.forEach(System.out::println);

        personList.sort(Comparator.comparing(Person::getAge).reversed());
        System.out.println("\nSorted PersonList by Age by reverse order");
        personList.forEach(System.out::println);

    }
}
