package part13.task54;

import java.util.Random;

public class MyThread extends Thread {

    private int[] num = new int[10];

    public MyThread(String name) {
        super(name);
        setNum();
    }

    public int[] getNum() {
        return num;
    }

    public void setNum() {
        for (int i = 0; i < num.length; i++) {
            num[i] = new Random().nextInt(100);
        }
    }

    @Override
    public void run() {
        int max = 0;
        for (int i : num) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(getName() + ", max element = " + max);
    }
}
