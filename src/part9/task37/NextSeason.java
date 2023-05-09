package part9.task37;

import part9.task36.EnumSeason;
import util.Util;


public class NextSeason {
    public static void main(String[] args) {
        System.out.println("Enter the name or number(1-4) of season");
        EnumSeason.nextSeason(Util.scannerString());
    }
}

