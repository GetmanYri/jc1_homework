package part14.task58;

import java.util.Random;

public class Producer extends Thread {
    @Override
    public void run() {

        while (true) {
            QueueNum.getInstance().addQueue(new Random().nextInt(100));

        }
    }
}