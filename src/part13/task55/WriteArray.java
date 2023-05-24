package part13.task55;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Random;

public class WriteArray {


    private int[] num = new int[10];

    public void setNum() {
        for (int i = 0; i < num.length; i++) {
            num[i] = new Random().nextInt(100);
        }
    }

    public void writeArray(String nameOfDir, String nameOfFile) throws IOException {
        File dir = new File(nameOfDir);
        if (!dir.exists()) {
            dir.mkdir();
        }

        File file = new File(nameOfDir + "/" + nameOfFile);

        if (!file.exists()) {
            file.createNewFile();
        }
        setNum();
        Writer writer = new FileWriter(file);
        writer.write(Arrays.toString(num));
        writer.close();

    }
}
