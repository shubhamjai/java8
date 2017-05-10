package main.java.lambda.part3.iterable;

import main.java.entity.City;
import main.java.entity.Person;
import main.java.util.PersonUtil;

import java.util.*;

public class Example2 {
    public static void main(String args[]){
        List<Person> personList = PersonUtil.getPersonList();

        Map<City, List<Person>> map1 = new HashMap<>();
        City paris = new City("Paris");
        System.out.println("People from paris : " + map1.getOrDefault(paris, Collections.emptyList()));
        map1.computeIfAbsent(paris, city -> new ArrayList<>()).add(personList.get(3));

        System.out.println("\nMap1");

        map1.forEach((city, people) -> System.out.println(city + " "+ people));

        Map<City, List<Person>> map2 = new HashMap<>();
        City delhi = new City("Delhi");
        City mumbai = new City("Mumbai");
        City bangalore = new City("Bangalore");

        map2.computeIfAbsent(delhi, city -> new ArrayList<>()).add(personList.get(0));
        map2.computeIfAbsent(mumbai, city -> new ArrayList<>()).add(personList.get(1));
        map2.computeIfAbsent(bangalore, city -> new ArrayList<>()).add(personList.get(2));
        System.out.println("\nMap2");
        map2.forEach((city, people) -> System.out.println(city + " "+ people));

        map2.forEach(
                ((city, people) ->
                        map1.merge(
                                city,people,
                                (peopleFromMap1, peopleFromMap2) ->{
                                    peopleFromMap1.addAll(peopleFromMap2);
                                    return peopleFromMap1;
                                }
                        )
                )
        );

        System.out.println("\nMap1 after merge with map2");
        map1.forEach((city, people) -> System.out.println(city + " "+ people));
    }
}
