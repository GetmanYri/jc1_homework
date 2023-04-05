package part6.task25;

public class Main {
    public static void main(String[] args) {

        Time time = new Time(1, 1, 32);
        Time time2 = new Time(7255);

        int compareTo = Time.compareTo(time.getAllSeconds(), time2.sec);
        Time.print(compareTo);

    }
}
