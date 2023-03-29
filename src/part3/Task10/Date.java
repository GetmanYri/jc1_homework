package part3.Task10;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        String error = "Введена неверная дата";
        if (day <= 31 && day >= 0) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                    if (day == 31) {
                        month++;
                        System.out.print("01." + month + "." + year);
                    } else {
                        day++;
                        System.out.print(day + "." + month + "." + year);
                    }
                    break;
                case 2:
                    if (year % 4 == 0 && day == 29) {
                        month++;
                        System.out.println("01." + month + "." + year);
                    } else if (day == 28) {
                        month++;
                        System.out.println("01." + month + "." + year);
                    } else if (day <= 27) {
                        day++;
                        System.out.println(day + "." + month + "." + year);
                    } else {
                        System.out.println(error);
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day == 30) {
                        month++;
                        System.out.print("01." + "0" + month + "." + year);
                    } else if (day < 30) {
                        day++;
                        System.out.print(day + "." + "0" + month + "." + year);
                    } else {
                        System.out.println(error);
                    }
                    break;
                case 12:
                    if (day == 31) {
                        month = 1;
                        year++;
                        System.out.print("01." + "0" + month + "." + year);
                    } else {
                        day++;
                        System.out.print(day + "." + "0" + month + year);
                    }
                    break;
                default:
                    System.out.println(error);

            }
        } else {
            System.out.println(error);
        }

    }
}



