package util;

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
}
