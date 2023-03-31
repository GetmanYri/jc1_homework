package part5.task20;

import java.util.Arrays;

public class CreateArrayTwo {
    public static void main(String[] args) {


        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 100);
            if (i % 2 == 0) {
                System.out.println(myArray[i]);
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
