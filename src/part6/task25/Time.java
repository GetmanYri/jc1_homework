package part6.task25;

public class Time {

    int sec;
    int min;
    int hour;
    int allSeconds;

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public Time(int allSec) {
        this.sec = allSec;
    }

    public int getAllSeconds() {
        allSeconds = sec + (min * 60) + (hour * 3600);
        return allSeconds;
    }

    public static int compareTo(int a, int b) {
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);

        int lim = Math.min(str1.length(), str2.length());
        for (int k = 0; k < lim; k++) {
            if ((int) str1.charAt(k) != (int) str2.charAt(k)) {
                return ((int) str1.charAt(k) - (int) str2.charAt(k));
            }
        }
        return str1.length() - str2.length();
    }

    public static void print(int print) {
        System.out.println("compareTo="+print);
    }
}






