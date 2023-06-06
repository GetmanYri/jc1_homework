package util;

import java.util.Random;
import java.util.Scanner;

public class Util {

    public static int scannerInt() {
        Scanner util = new Scanner(System.in);
        return util.nextInt();
    }

    public static double scannerDouble() {
        Scanner util = new Scanner(System.in);
        return util.nextDouble();
    }

    public static String scannerString() {
        Scanner util = new Scanner(System.in);
        return util.nextLine();
    }

    public static String randomString() {
        Random r = new Random();
        return r.ints(97, 123)
                .limit(7)
                .mapToObj(c -> (char) c).collect(StringBuffer::new, StringBuffer::append, StringBuffer::append)
                .toString();

    }
}


