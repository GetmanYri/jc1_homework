package part12.task52;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonWriter {
    public void personWriter(Person[] person, File file) throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for(Person persons:person) {
            oos.writeObject(persons);
        }
        oos.close();
        fos.close();

    }
}
