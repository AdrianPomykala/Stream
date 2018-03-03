package com.sda.person;

import java.util.*;
import java.util.stream.Collectors;

public class MainPerson {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Jacek", "Kowalski", 18, true));
        persons.add(new Person("Andżelika", "Dżoli", 25, false));
        persons.add(new Person("Wanda", "Ibanda", 12, false));
        persons.add(new Person("Marek", "Marecki", 17, true));
        persons.add(new Person("Johny", "Brawo", 25, true));
        persons.add(new Person("Stary", "Pan", 80, true));
        persons.add(new Person("Newbie", "Noob", 12, true));
        persons.add(new Person("Newbies", "Sister", 19, false));

        List<Person> mezczyzni = persons.stream()
                .filter((p) -> {
                    return p.isMale();
                }).collect(Collectors.toList());
        System.out.println(mezczyzni);
        List<Person> dorosleKobiety = persons.stream()
                .filter(p -> !p.isMale() & p.getAge()>=18)
        .collect(Collectors.toList());
        List<Person> przedzial = persons.stream()
                .filter(p -> p.getAge()>=15 & p.getAge()<=19)
                .collect(Collectors.toList());
        Optional<Person> osoba = persons.stream()
                .filter((p -> p.getFirstName().equals("Jacek") & p.getAge()>=18)).findFirst();
        osoba.ifPresent(jacek -> System.out.println(osoba));
        int sum = persons.stream()
                .mapToInt((p) -> p.getAge())
                .sum();
        System.out.println(sum);
        OptionalDouble mean = persons.stream()
                .filter(programmer -> programmer.isMale())
                .mapToInt((p) -> p.getAge())
                .average();
        System.out.println(mean);
        Person najstarszy = persons.stream().max(Comparator.comparing(Person::getAge)).get();
        System.out.println(najstarszy);

    }
}
