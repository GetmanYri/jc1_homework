package part10.task40;

public class Student {
    private String name;
    private int grade;

    public Student(String name) {
        this.grade = (int) (Math.random() * 10);
        this.name = name;
    }

    @Override
    public String toString() {
        return "{Student " +
                "name - " + name +
                ", grade = " + grade +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

}
