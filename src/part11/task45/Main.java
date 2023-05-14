package part11.task45;

import util.Util;

public class Main {
    public static void main(String[] args) {


        System.out.println("Enter side a");
        int sideA = Integer.parseInt(Util.scannerString());
        System.out.println("Enter side b");
        int sideB = Integer.parseInt(Util.scannerString());
        System.out.println("Enter radius");
        int radius = Integer.parseInt(Util.scannerString());
        try {
            if (sideA <= 0 | sideB <= 0 | radius <= 0) {
                throw new MyException("Incorrect input!!!");
            }
            if ((Math.sqrt((Math.pow(sideA, 2) + Math.pow(sideB, 2))) >= radius)) {
                System.out.println("Круг не перекрывает прямоугольник");
            } else {
                System.out.println("Круг перекрывает прямоугольник");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}
