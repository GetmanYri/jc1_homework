package part11.task46;

import part11.task45.MyException;
import util.Util;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        Circle circle=new Circle();
        try {
            rectangle.setSideA();
            rectangle.setSideB();
            circle.setRadius();
            Calculation.calculation(rectangle.getSideA(), rectangle.getSideB(), circle.getRadius());
        } catch (MyException e) {
            e.printStackTrace();
            System.exit(1);
        }

    }
}
