package part12.task52;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("PersonObjects.dat");
        List<Person> readPerson = new LinkedList<>();
        Person[] persons = {
                new Person("Bob", "Marley", 23),
                new Person("Tom", "Cruise", 22),
                new Person("Liza", "Edelstein", 33),
                new Person("Kate", "Perry", 25),
                new Person("Michael", "Jackson", 40)
        };
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            PersonWriter personWriter = new PersonWriter();
            personWriter.personWriter(persons, file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {

            while (true) {
                try {
                    Person person = (Person) ois.readObject();
                    System.out.println(person);
                    readPerson.add(person);
                } catch (EOFException eofe) {
                    break;
                }
            }
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
