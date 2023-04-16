package part7.task27;

import util.Util;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindInString {
    public static void main(String[] args) {
        int count = 0;
        StringBuilder string = new StringBuilder();
        string.append(Util.scannerString());

        Pattern p = Pattern.compile("\\p{Punct}");
        Matcher m = p.matcher(string);
        while (m.find()) {
            int start = m.start();
            count++;
            System.out.print(string.charAt(start));
        }
        System.out.print("\nquantity=" + count);
    }
}
