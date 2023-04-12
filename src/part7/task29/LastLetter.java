package part7.task29;

import util.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastLetter {
    public static void main(String[] args) {
        String string= Util.scannerString();
        System.out.println(string);

        Pattern letter=Pattern.compile("\\w+");
        Matcher lastLetter=letter.matcher(string);
     while (lastLetter.find()){
         System.out.print(string.charAt(lastLetter.end()-1)+" ");
     }
    }
}
