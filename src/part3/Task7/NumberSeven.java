package part3.Task7;

import java.util.Scanner;

public class NumberSeven {
    public static boolean ifSeven;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            ifSeven = ifNumberSeven(number);
            //System.out.println("It's int");
        } else if (sc.hasNextLong()) {
            long number = sc.nextLong();
            ifSeven = ifNumberSeven(number);
            //System.out.println("It's Long");
        } else {
            System.out.println("Введено неверное значение, перезапустите программу!");
            System.exit(1);
        }
        if (ifSeven) {
            System.out.println("Последняя цифра числа - 7");
        } else {
            System.out.println("Последняя цифра числа не 7");
        }
    }

    public static boolean ifNumberSeven(int number) {
        if (number % 10 == 7) {
            ifSeven = true;
        }
        return ifSeven;
    }

    public static boolean ifNumberSeven(long number) {
        if (number % 10 == 7) {
            ifSeven = true;
        }
        return ifSeven;
    }
}
