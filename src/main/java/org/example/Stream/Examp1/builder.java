package org.example.Stream.Examp1;

import java.util.List;
import java.util.stream.Collectors;

public class builder {
    public static void main(String[] args) {

        List<Persons> people = getPeople();
        List<Persons> female = people.stream()
                .filter(person -> person.getGender().equals(Gender.MALE))
                .collect(Collectors.toList());
        female.forEach(System.out::println);

        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() > 23);
        System.out.println(anyMatch);

        //.collect(Collectors.joining(", "));
        String names = people.stream()
                .map(pers -> pers.getName())
                .collect(Collectors.joining(", "));
        System.out.println(names);
    }

    public static List<Persons> getPeople() {
        return List.of(
                new Persons("Mesud Mujanovic", 29, Gender.MALE),
                new Persons("Erdal Zoranic", 25, Gender.MALE),
                new Persons("Omer Mujanovic", 29, Gender.MALE),
                new Persons("Mirzet Sabotic", 28, Gender.MALE),
                new Persons("Nadija Mujanovic", 2, Gender.FEMALE)
        );
    }
}
