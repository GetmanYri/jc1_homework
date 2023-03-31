package part4.task18;


import java.text.DecimalFormat;
import java.util.Arrays;

public class BuhFormat {
    public static void main(String[] args) {
        long num = 20516413115L;
        System.out.println(new DecimalFormat("#,###").format(num));
    }
}

