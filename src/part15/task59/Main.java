package part15.task59;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        //args[0]="C:\\YRI\\jc1_homework\\directoryTask59"
        //args[1]="file"
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 10; i++) {
            executorService.submit(new CallableTask(args[0]+File.separator+i, args[1]));
        }
        executorService.shutdown();
    }
}
