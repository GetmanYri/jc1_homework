package part4.task18;


import java.text.DecimalFormat;
import java.util.Arrays;

public class BuhFormat {
    public static void main(String[] args) {

        long num = 20_023_143;
        // System.out.println(new DecimalFormat("#,###").format(num));
        int count = 0;
        long count2 = num;
        while (count2 > 0) {
            count2 /= 10;
            count++;
        }
        long[] numArray = new long[count];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = num % 10;
            num /= 10;
        }
        if (count % 3 == 0) {
            int count3 = 0;
            for (int i = numArray.length - 1; i >= 0; i--) {
                System.out.print(numArray[i]);
                count3++;
                if (count3 % 3 == 0) {
                    System.out.print(" ");
                }
            }
        } else if (count % 3 == 2) {
            int count3 = 0;
            for (int i = numArray.length - 1; i >= 0; i--) {
                System.out.print(numArray[i]);
                count3++;
                if (count3 == 2) {
                    //System.out.println(" ");
                    count3 = 3;
                }
                if (count3 % 3 == 0) {
                    System.out.print(" ");
                }
            }
        } else {
            int count3 = 0;
            for (int i = numArray.length - 1; i >= 0; i--) {
                System.out.print(numArray[i]);
                count3++;
                if (count3 == 1) {
                    count3 = 3;
                }
                if (count3 % 3 == 0) {
                    System.out.print(" ");
                }
            }
        }
    }
}

