package part3.Task11;

import java.util.Arrays;
import java.util.Scanner;

public class HowMuchHomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] homeA = new int[2];
        int[] homeB = new int[2];
        int[] place = new int[2];
        String yes = "Дома помещаются";
        String no = "Дома не помещаются";
        System.out.println("Введите стороны а и b 1-го дома");
        for (int i = 0; i < homeA.length; i++) {
            homeA[i] = sc.nextInt();
        }
        System.out.println("Введите стороны с и d 2-го дома");
        for (int i = 0; i < homeB.length; i++) {
            homeB[i] = sc.nextInt();
        }
        System.out.println("Введите стороны участка e и f");
        for (int i = 0; i < place.length; i++) {
            place[i] = sc.nextInt();
        }
        Arrays.sort(homeA);
        Arrays.sort(homeB);
        Arrays.sort(place);
        int e = place[0];

        if (homeB[1] > place[1] || homeA[1] > place[1]) {
            System.out.println(no);

        } else {

            if (homeA[1] >= homeB[1]) {
                place[1] -= homeA[1];
                place[0] -= homeA[0];
                if (homeB[0] <= place[0]) {
                    System.out.println(yes);
                } else if (homeB[1] <= e && homeB[0] <= place[1]) {
                    System.out.println(yes);
                } else {
                    System.out.println(no);
                }

            } else {
                place[1] -= homeB[1];
                place[0] -= homeB[0];
                if (homeA[0] <= place[0]) {
                    System.out.println(yes);
                } else if (homeA[1] <= e && homeA[0] <= place[1]) {
                    System.out.println(yes);
                } else {
                    System.out.println(no);
                }
            }
        }
    }
}

