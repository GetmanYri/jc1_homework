package part5.task22;

import java.util.Arrays;

public class MyArraySum {
    public static void main(String[] args) {

        int[] myArray = new int[10];
        int indexOne = 0;
        int indexTwo = 0;
        int sum = 0;
        int countOne = 0;
        int countTwo = 0;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 10);
        }

        System.out.println(Arrays.toString(myArray));

        int maxNum = myArray[0];
        int minNum = myArray[0];

        for (int element : myArray) {
            if (element > maxNum) {
                maxNum = element;
            }
            if (element < minNum) {
                minNum = element;
            }
        }
        if (maxNum == minNum) {
            System.out.println("sum=0");
            System.exit(1);
        }
        for (int element : myArray) {
            if (element == maxNum) {
                countOne++;
            }
        }
        for (int element : myArray) {
            if (element == minNum) {
                countTwo++;
            }
        }

        int[] maxIndexArray = new int[countOne];
        int[] minIndexArray = new int[countTwo];

        countOne = 0;
        countTwo = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == maxNum) {
                maxIndexArray[countOne] = i;
                countOne++;
            }
            if (myArray[i] == minNum) {
                minIndexArray[countTwo] = i;
                countTwo++;
            }
        }

        int interval;
        int saveInterval = 0;

        for (int elementOne : maxIndexArray) {
            for (int elementTwo : minIndexArray) {
                if (elementOne > elementTwo) {
                    interval = elementOne - elementTwo;
                } else {
                    interval = elementTwo - elementOne;
                }
                if (interval > saveInterval) {
                    saveInterval = interval;
                    indexOne = elementOne;
                    indexTwo = elementTwo;
                }
            }
        }

        if (indexOne > indexTwo) {
            for (int i = indexTwo + 1; i <= indexOne - 1; i++) {
                sum += myArray[i];
            }
        } else {
            for (int i = indexOne + 1; i <= indexTwo - 1; i++) {
                sum += myArray[i];
            }
        }
        System.out.println(" Sum  =" + sum);
    }
}
