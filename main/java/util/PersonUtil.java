package main.java.util;

import main.java.entity.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonUtil {
    public static List<Person> getPersonList() {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Shubham", "Jain", 28));
        personList.add(new Person("Vikas", "Kumar", 27));
        personList.add(new Person("Abhishek", "Kumar", 28));
        personList.add(new Person("Deepak", "Sharma", 23));
        return personList;
    }
}
