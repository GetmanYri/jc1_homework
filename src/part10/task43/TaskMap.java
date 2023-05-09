package part10.task43;

import util.Util;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskMap {
    public static void main(String[] args) {
        String stringForMap = Util.scannerString() + " ";


        String[] words = stringForMap.toLowerCase().split("\\W+");
        Map<String, Integer> word = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            int a = 0;
            Pattern pattern = Pattern.compile(words[i] + "\\W+");
            Matcher matcher = pattern.matcher(stringForMap.toLowerCase());
            while (matcher.find()) {
                a++;
            }
            word.put(words[i], a);
        }
        Set<String> keys = word.keySet();
        for (String key : keys) {
            System.out.println(key + " - " + word.get(key));
        }
    }
}
