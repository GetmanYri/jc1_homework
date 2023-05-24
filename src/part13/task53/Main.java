package part13.task53;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            new NewThread("Thread " + i).start();
        }
    }
}

class NewThread extends Thread {

    public NewThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(100));
        }
        for (Integer element : list) {
            sum += element;
        }
        System.out.println(getName() + ", average = " + (double) sum / list.size());

    }
}

