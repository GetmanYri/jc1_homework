package part12.task47;

import java.io.File;
import java.util.Objects;

public class FileOrDirectory {
    public static void main(String[] args) {
        File dir=new File("C:/users");
        System.out.println(dir.getAbsoluteFile());
        if (dir.exists()){
            for(File files: Objects.requireNonNull(dir.listFiles())){
                if(files.isDirectory()){
                    System.out.println(files.getName()+" - it's Directory");
                }else{
                    System.out.println(files.getName()+" - it's file");
                }
            }
        }else{
            System.out.println("Directory - "+dir.getAbsoluteFile()+", not found!");
        }
    }
}
