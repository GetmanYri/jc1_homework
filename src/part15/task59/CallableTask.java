package part15.task59;


import java.io.File;
import java.util.*;
import java.util.concurrent.Callable;

public class CallableTask implements Callable {
    private final String nameOfFile;
    private final String nameOfDir;

    public CallableTask(String nameOfDir, String nameOfFile) {
        this.nameOfFile = nameOfFile;
        this.nameOfDir = nameOfDir;
    }
    List<String> fileNames= Collections.synchronizedList(new ArrayList<>());
    @Override
    public List<String> call() throws Exception {
        for (int i = 1; i <= 10; i++) {
            WriteFile writeFile = new WriteFile();
            writeFile.writeFile(nameOfDir, nameOfFile+i+".txt");
        }
        Thread.sleep(new Random().nextInt(3000));
           fileNames= Arrays.asList(Objects.requireNonNull(new File(nameOfDir).list()));
        System.out.println(Thread.currentThread().getName()+" "+fileNames);

        return fileNames;

    }
}
