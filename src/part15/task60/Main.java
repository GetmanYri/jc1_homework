package part15.task60;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService= Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            Future<String> future = executorService.submit(new CallableTenNum());
            System.out.println(Thread.currentThread().getName()+" sum from future = "+future.get()+"\n");
        }
        executorService.shutdown();
    }
}
