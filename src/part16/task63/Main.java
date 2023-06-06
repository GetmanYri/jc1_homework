package part16.task63;

import util.Util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {

            list.add(new Person(Util.randomString(), Util.randomString(), (int) (Math.random() * 16) + 15));

        }

        List<String> surName = list.stream()
                .filter(s -> s.getAge() < 21)
                .peek(System.out::println)
                .sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName))
                .limit(4)
                .map(Person::getSurname)
                .collect(Collectors.toList());
        System.out.println("\n" + surName);
    }
}
