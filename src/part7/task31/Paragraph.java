package part7.task31;

import util.Util;

public class Paragraph {
    public static void main(String[] args) {
        System.out.println(Paragraph.findParagraph(Util.scannerString()));
    }

    public static String findParagraph(String stringForFind) {
        return stringForFind.replaceAll("(<p>|<p[^<>]+>)", "<p>");
    }
}
