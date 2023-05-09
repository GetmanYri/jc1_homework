package part9.task38;

import part9.task36.EnumSeason;
import util.Util;

public class CountOfDay {
    public static void main(String[] args) {
        System.out.println("Enter the name or number(1-4) of season");
        EnumSeason.countOfDay(Util.scannerString());
    }
}
