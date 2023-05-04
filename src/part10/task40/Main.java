package part10.task40;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentGrades = new ArrayList<>();
        studentGrades.add(new Student("bob"));
        studentGrades.add(new Student("Alen"));
        studentGrades.add(new Student("Alex"));
        studentGrades.add(new Student("Sam"));
        studentGrades.add(new Student("Kate"));
        studentGrades.add(new Student("Alex"));
        studentGrades.add(new Student("Doris"));
        System.out.println(studentGrades);
        System.out.println("Removing bad grades");
        PoorGrades.deletePoorGrades(studentGrades);
        System.out.println(studentGrades);
    }
}
