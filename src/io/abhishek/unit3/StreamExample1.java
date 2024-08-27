package io.abhishek.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import io.abhishek.Person;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Charles", "Dickens", 60),
            new Person("Lewis", "Carrol", 42),
            new Person("Thomas", "Carlyle", 51),
            new Person("Charlotte", "Bronte", 45),
            new Person("Matthew", "Arnold", 39)
        );

        people.stream()

        /** If this condition passes, the element remains in the stream 
         * otherwise it is removed, and filtererd list based on the predicate is printed.*/
        .filter(p -> p.getLastName().startsWith("C"))  
        .forEach(p -> System.out.println(p.getFirstName()));  

        // Stream<Person> stream = people.stream();

        long count = people.stream()
        .filter(p -> p.getLastName().startsWith("D"))
        .count();

        System.out.println(count);

        /** Parallel stream
         * Returns a possibly parallel Stream with this collection as its source. 
         * It is allowable for this method to return a sequential stream.
         */
        people.parallelStream()
        .filter(p -> p.getLastName().startsWith("D"))
        .count();
    }

}
