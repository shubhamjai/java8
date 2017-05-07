package main.java.part1.functions;

import main.java.part1.functions.entity.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;
/**
 * Created by shubham on 06-05-2017.
 */
public class Functions {
    public static void main(String args[]) {
        Comparator<Person> cmpAge = (p1, p2) -> p2.getAge() - p1.getAge();
        Comparator<Person> cmpFirstName = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
        Comparator<Person> cmpLastName = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());

        System.out.println("compare by age");
        sortList(cmpAge);

        System.out.println("compare by first name");
        sortList(cmpFirstName);

        System.out.println("compare by last name");
        sortList(cmpLastName);

    }

    private static void sortList(Comparator<Person> comparator) {
        List<Person> personList = getPersonList();
        Collections.sort(personList, comparator);
        Iterator<Person> iterator = personList.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

    private static List<Person> getPersonList() {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Shubham", "Jain", 28));
        personList.add(new Person("Vikas", "Kumar", 27));
        personList.add(new Person("Abhishek", "Kumar", 28));
        personList.add(new Person("Deepak", "Sharma", 23));
        return personList;
    }
}
