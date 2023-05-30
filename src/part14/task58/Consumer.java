package part14.task58;

public class Consumer extends Thread {
    @Override
    public void run() {
        while (true) {
            QueueNum.getInstance().takeNum();
        }
    }
}
