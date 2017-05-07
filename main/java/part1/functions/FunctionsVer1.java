package main.java.part1.functions;

import main.java.part1.functions.entity.Person;

/**
 * Created by shubham on 06-05-2017.
 */
public class FunctionsVer1 {

    public static void main(String args[]) {
/*
        Function<Person, Integer> funcAge = Person::getAge;
*/
        Comparator<Person> cmpPersonAge = Comparator.comparing(Person::getAge);
        Comparator<Person> cmpPersonFirstName = Comparator.comparing(Person::getFirstName);
        Comparator<Person> cmpPersonLastName = Comparator.comparing(Person::getLastName);

        Comparator<Person> cmp = cmpPersonAge.thenComparing(cmpPersonFirstName);

        Comparator<Person> cmp1 = Comparator.comparing(Person::getAge)
                .thenComparing(Person::getFirstName)
                .thenComparing(Person::getLastName);
    }


}
