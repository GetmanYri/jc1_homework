package part14.task58;


import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueNum {
    private static QueueNum queueNum;
    private int lim = 80;
    int count = 0;
    private Queue<Integer> queue = new ConcurrentLinkedQueue<>();

    private QueueNum() {
    }


    public synchronized static QueueNum getInstance() {
        if (queueNum == null) {
            return queueNum = new QueueNum();
        }
        return queueNum;

    }

    public synchronized void addQueue(int num) {

        while (queue.size() >= this.lim) {
            this.lim = 80;
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.lim = 100;
        notifyAll();
        if (queue.offer(num)) {
            System.out.println(Thread.currentThread().getName() + " add in queue number - " + num+" size= "+queue.size()+" lim="+lim);
            /*try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
        } else {
            System.out.println(Thread.currentThread().getName() + " error add.");
        }
    }

    public synchronized void takeNum() {
        while (queue.size() <1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notifyAll();
        System.out.println(Thread.currentThread().getName() + " take element - " + queue.remove()+" size="+queue.size()+"cou="+count);
       /* try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
        count++;
        if (count == 10_000) {

            System.exit(5);
        }
    }

}
