package part12.task51;


import java.io.*;
import java.util.Arrays;
import java.util.Objects;

public class MkDir {
    public static void main(String[] args) {
        File file = new File("directoryTask51/1/2/3");
        if (!file.exists()) {
            file.mkdirs();
        }

        for (int i = 1; i < 6; i++) {
            try {
                Writer writer = new FileWriter(file.getAbsolutePath() + "/text" + i + ".txt");
                for (int j = 0; j < 10; j++) {
                    int s = (int) (Math.random() * 100);
                    writer.write(s+" ");
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (Writer writer = new FileWriter(file.getAbsolutePath() + "/copyOfAllFiles.txt")) {
            for (String name : Objects.requireNonNull(file.list())) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getAbsolutePath() + "/" + name));

                while (bufferedReader.ready()) {
                    writer.append(bufferedReader.readLine()).append("\n");
                }
                bufferedReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Writer writer = new FileWriter(file.getAbsolutePath() + "/listNameFiles.txt");) {
            writer.write(Arrays.toString(file.list()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
