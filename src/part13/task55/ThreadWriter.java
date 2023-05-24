package part13.task55;

import java.io.File;
import java.io.IOException;

public class ThreadWriter extends Thread {
    private String nameOfFile;
    private String nameOfDir;

    public ThreadWriter(String name, String nameOfDir, String nameOfFile) {
        super(name);
        this.nameOfFile = nameOfFile;
        this.nameOfDir = nameOfDir;
    }

    @Override
    public void run() {

        try {
            new WriteArray().writeArray(nameOfDir, nameOfFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
