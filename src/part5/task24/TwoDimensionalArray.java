package part5.task24;



public class TwoDimensionalArray {
    public static void main(String[] args) {


        int countTwo = 0;
        int[][] myArray = new int[5][5];
        int countOne = 0;

        for (int i = 0; i < myArray.length; i++) {
            countTwo = i;
            if (countOne > myArray[i].length / 2) {
                break;
            }
            for (int j = countOne; j < myArray[i].length - countOne; j++) {
                myArray[i][j] = 1;
            }
            countOne++;
        }

        countOne = 0;

        for (int i = myArray.length - 1; i >= countTwo; i--) {
            if (countOne > myArray[i].length / 2) {
                break;
            }
            for (int j = countOne; j < myArray[i].length - countOne; j++) {
                myArray[i][j] = 1;
            }
            countOne++;
        }

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j]);
            }
            System.out.println();
        }
    }
}
