package part15.task61;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        //System.out.println(System.getProperties());
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {

            executorService.submit(new CallableHelloWorld(System.getProperty("user.dir") + File.separator
                    + "directoryTask61", i + ".txt"));
        }
        executorService.shutdown();
    }
}
