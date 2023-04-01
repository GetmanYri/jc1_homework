package part5.task21;

import java.util.Arrays;

public class MaxIndexArray {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        int maxIndex = 0;
        int maxNum = 0;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 100);
            if (myArray[i] > maxNum) {
                maxNum = myArray[i];
                maxIndex = i;
            }

        }
        System.out.println(Arrays.toString(myArray));
        System.out.println("Index of max number=" + maxIndex);
    }
}
