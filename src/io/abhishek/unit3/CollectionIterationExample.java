package io.abhishek.unit3;

import java.util.Arrays;
import java.util.List;

import io.abhishek.Person;

public class CollectionIterationExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Charles", "Dickens", 60),
            new Person("Lewis", "Carrol", 42),
            new Person("Thomas", "Carlyle", 51),
            new Person("Charlotte", "Bronte", 45),
            new Person("Matthew", "Arnold", 39)
        );

        System.out.println("Using for loop: ");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

        System.out.println("Using for each loop: ");
        for(Person p : people) {
            System.out.println(p);
        }

        System.out.println("Using lambda for each method");
        people.forEach(System.out::println);
    }

}
