package part15.task59;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class WriteFile {
    public synchronized void writeFile(String nameOfDir, String nameOfFile) throws IOException {


            System.out.println(Thread.currentThread().getName()+" start in writeFile");
            File dir = new File(nameOfDir);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            File file = new File(dir.getAbsolutePath() + "/" + nameOfFile);
            if (!file.exists()) {
                file.createNewFile();
            }
            try (Writer writer = new FileWriter(file)) {
                for (int i = 1; i <= 10; i++) {
                    writer.write("String" + i + "\n");
                }
            }
            System.out.println(Thread.currentThread().getName()+" end in writeFile");
        }
    }

