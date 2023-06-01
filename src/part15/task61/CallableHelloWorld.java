package part15.task61;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalTime;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.Callable;

public class CallableHelloWorld implements Callable<Boolean> {
    private final String text = "Hello World";
    private String nameOfFile;
    private String nameOfDir;

    public CallableHelloWorld(String nameOfDir, String nameOfFile) {
        this.nameOfFile = nameOfFile;
        this.nameOfDir = nameOfDir;
    }

    @Override
    public Boolean call() throws Exception {


        //boolean res;
        /*File dir = new File(nameOfDir);

        dir.mkdirs();

        File file = new File(dir.getAbsolutePath() + File.separator + nameOfFile);

        res = file.createNewFile();

        try (Writer writer = new FileWriter(file)) {
            writer.write(text + LocalTime.now() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }*/
        //return res;
        return new WriteFileDate().writeFileDate(nameOfDir,nameOfFile,text);
    }
}
