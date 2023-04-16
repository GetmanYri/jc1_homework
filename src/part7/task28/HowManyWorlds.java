package part7.task28;

import part5.task19.CreateArray;
import util.Util;

import java.util.Arrays;

public class HowManyWorlds {
    public static void main(String[] args) {
        String string = Util.scannerString();
        //String[] strings = string.trim().split("(\\s+[_]+\\W+|\\s\\W+|\\s)+");
        String[] strings = string.trim().split("(\\s+\\p{Punct}+\\s+|\\s+)");
        System.out.println(Arrays.toString(strings));
        System.out.println("Worlds in the string - "+strings.length);

    }
}
