package part4.task14;

import java.math.BigInteger;

public class Multiplication {
    public static void main(String[] args) {

        int num = 2;
        BigInteger multiplication = BigInteger.ONE;
        do {
            multiplication = multiplication.multiply(BigInteger.valueOf(num));
            num++;
        } while (num <= 25);
        System.out.println(multiplication);

    }
}
