package part2.task5;

import java.util.Scanner;

public class CalculationMethod {
    private int numberOne;
    private int numberTwo;
    private int result;

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public int getNumberOne() {
        return numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setResult(int numberOne, int numberTwo) {
        result = (numberOne + numberTwo) + (numberOne * numberTwo);
    }

    public int getResult() {
        return result;
    }


    public static void main(String[] args) {
        CalculationMethod result = new CalculationMethod();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1-е число");
        result.setNumberOne(sc.nextInt());
        System.out.println("Введите 2-е число");
        result.setNumberTwo(sc.nextInt());
        result.setResult(result.getNumberOne(), result.getNumberTwo());
        System.out.println(result.getResult());

    }
}
