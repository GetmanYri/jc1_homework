package part5.task23;

import java.util.Arrays;

public class ExpandArray {
    public static void main(String[] args) {

        int[] myArray = new int[10];
        int save;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 10);
        }

        System.out.println(Arrays.toString(myArray));

        for (int i = 0; i < myArray.length / 2; i++) {
            save = myArray[i];
            myArray[i] = myArray[myArray.length - 1 - i];
            myArray[myArray.length - 1 - i] = save;
        }
        System.out.println(Arrays.toString(myArray));
    }
}
