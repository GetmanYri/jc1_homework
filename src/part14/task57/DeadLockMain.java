package part14.task57;

public class DeadLockMain {

    public static void main(String[] args) {
        String a="String A";
        String b="String B";
        String c="String C";

        Thread thread1=new Thread() {
            @Override
            public void run() {
                synchronized (a){

                    System.out.println(Thread.currentThread().getName()+" synchronized "+a);
                    synchronized (b){
                        System.out.println(Thread.currentThread().getName()+" synchronized "+b);

                    }
                }
            }
        };
        Thread thread2=new Thread() {
            @Override
            public void run() {
                synchronized (b){
                    System.out.println(Thread.currentThread().getName()+" synchronized "+b);

                    synchronized (a){
                        System.out.println(Thread.currentThread().getName()+" synchronized "+a);

                    }
                }
            }
        };
        Thread thread3=new Thread() {
            @Override
            public void run() {
                synchronized (c){
                    System.out.println(Thread.currentThread().getName()+" synchronized "+c);
                    synchronized (b){
                        System.out.println(Thread.currentThread().getName()+" synchronized "+b);

                    }
                }
            }
        };
        thread1.start();
        thread2.start();
        thread3.start();
    }

}