package main.java.lambda.part1.functions;

import main.java.entity.Person;
import main.java.util.PersonUtil;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;

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
        List<Person> personList = PersonUtil.getPersonList();
        Collections.sort(personList, comparator);
        Iterator<Person> iterator = personList.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

}
