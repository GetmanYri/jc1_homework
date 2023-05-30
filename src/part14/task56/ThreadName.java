package part14.task56;

public class ThreadName extends Thread {
    @Override
    public void run() {

        printName();

    }

    public void printName() {
        System.out.println(Thread.currentThread().getName());
        try {

            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {

           ThreadName threadName= new ThreadName();
           threadName.start();
           threadName.join();

        }
    }
}
