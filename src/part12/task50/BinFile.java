package part12.task50;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class BinFile {
    public static void main(String[] args) {
        File file=new File("task50.dat");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        int sum=0;
        List<Integer>list=new LinkedList<>();

        try(DataOutputStream dataOutputStream=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))){
            for(int i =0;i<20;i++){
                dataOutputStream.writeInt((int)(Math.random()*100));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        try(DataInputStream dataInputStream=new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            while (true) {
                try  {
                    int res = dataInputStream.readInt();
                    System.out.print(res+" ");
                    list.add(res);
                } catch (EOFException ex) {
                    break;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        for(Integer res:list){
            sum+=res;
        }
        System.out.println("\nAverage = "+(double)sum/list.size());
    }
}
