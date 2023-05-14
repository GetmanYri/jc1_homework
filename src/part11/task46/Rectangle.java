package part11.task46;

import part11.task45.MyException;
import util.Util;

public class Rectangle {
    private int sideA;
    private int sideB;

    public int getSideA() {
        return sideA;
    }

    public void setSideA() throws MyException {
        System.out.println("Enter side a");
        try {
            this.sideA = Integer.parseInt(Util.scannerString());
            if (this.sideA <= 0) {
                throw new MyException("Side A<=0");
            }
        } catch (NumberFormatException e) {
            throw new MyException("Incorrect input String side A", e);
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB() throws MyException {
        try {
            System.out.println("Enter side b");
            this.sideB = Integer.parseInt(Util.scannerString());
            if (this.sideB <= 0) {
                throw new MyException("Side B<=0");
            }
        } catch (NumberFormatException e) {
            throw new MyException("Incorrect input String side B", e);
        }
    }
}



