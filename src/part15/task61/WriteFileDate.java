package part15.task61;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalTime;

public class WriteFileDate {

    public synchronized boolean writeFileDate(String nameOfDir, String nameOfFile, String text) throws IOException {
        System.out.println(Thread.currentThread().getName() + " start in writeFileDate ");

        boolean res;
        File dir = new File(nameOfDir);

        dir.mkdirs();

        File file = new File(dir.getAbsolutePath() + File.separator + nameOfFile);

        res = file.createNewFile();

        try (
                Writer writer = new FileWriter(file)) {
            writer.write(text + LocalTime.now() + "\n");
        } catch (
                IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        System.out.println(Thread.currentThread().getName() + " end in writeFileDate ");
        return res;
    }
}
