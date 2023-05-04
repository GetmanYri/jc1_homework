package part10.task42;

import part10.task40.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MaxGrade {
    public static void main(String[] args) {
        List<Student> studentGrades = new ArrayList<>();
        studentGrades.add(new Student("Bob"));
        studentGrades.add(new Student("Tom"));
        studentGrades.add(new Student("Alen"));
        studentGrades.add(new Student("Alex"));
        studentGrades.add(new Student("Sam"));
        studentGrades.add(new Student("Kate"));
        studentGrades.add(new Student("Mary"));
        studentGrades.add(new Student("Doris"));
        System.out.println(studentGrades);

        int indexOfMax = 0;

        Iterator<Student> iterator = studentGrades.iterator();
        while (iterator.hasNext()) {
            int a = studentGrades.indexOf(iterator.next());
            if (studentGrades.get(indexOfMax).getGrade() < studentGrades.get(a).getGrade()) {
                indexOfMax = a;
            }
        }
        for (int i = 0; i < studentGrades.size(); i++) {
            if (i == indexOfMax) {
                continue;
            }
            if (studentGrades.get(indexOfMax).getGrade() ==
                    studentGrades.get(i).getGrade()) {
                System.out.println(studentGrades.get(i).getName() + " highest score -" +
                        studentGrades.get(i).getGrade());
            }
        }
        System.out.println(studentGrades.get(indexOfMax).getName() + " highest score -" +
                studentGrades.get(indexOfMax).getGrade());
    }
}
