package part11.task46;

import part11.task45.MyException;
import util.Util;

public class Circle {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius() throws MyException {
        System.out.println("Enter radius");
        try {
            this.radius = Integer.parseInt(Util.scannerString());
            if (this.radius<=0){
                throw new MyException("Incorrect input radius<=0");
            }
        } catch (NumberFormatException e) {
            throw new MyException("Incorrect input string radius",e);
        }

    }
}
