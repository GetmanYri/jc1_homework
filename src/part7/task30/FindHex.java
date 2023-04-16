package part7.task30;

import util.Util;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindHex {
    public static void main(String[] args) {
        String string = Util.scannerString();
        System.out.println(string);
        FindHex.findHex(string);

    }

    public static void findHex(String string) {
        int count = 0;
        Pattern findHex = Pattern.compile("0x\\p{XDigit}+");
        Matcher hexInString = findHex.matcher(string);
        while (hexInString.find()) {
            System.out.println(string.substring(hexInString.start(), hexInString.end()));
            count++;
        }
        System.out.println("In the String - " + count + " hexadecimal numbers");
    }
}
