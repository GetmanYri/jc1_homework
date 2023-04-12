package part7.task28;

import part5.task19.CreateArray;
import util.Util;

import java.util.Arrays;

public class HowManyWorlds {
    public static void main(String[] args) {
        String string=Util.scannerString();
        System.out.println(string);
        String[] strings=string.trim().split("\\W+");
        System.out.println(Arrays.toString(strings));
        System.out.println(strings.length);

    }
}
