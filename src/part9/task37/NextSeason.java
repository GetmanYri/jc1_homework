package part9.task37;

import part9.task36.EnumSeason;

public class NextSeason {
    public static void nextSeason(String nameOfSeason) {

        switch (nameOfSeason.toUpperCase()) {
            case "WINTER":
            case "1":
                System.out.println("Next season - " + EnumSeason.SPRING.getDescription());
                break;
            case "SPRING":
            case "2":
                System.out.println("Next season - " + EnumSeason.SUMMER.getDescription());
                break;
            case "SUMMER":
            case "3":
                System.out.println("Next season - " + EnumSeason.AUTUMN.getDescription());
                break;
            case "AUTUMN":
            case "4":
                System.out.println("Next season - " + EnumSeason.WINTER.getDescription());
                break;
            default:
                System.out.println("Error Enter");
        }

    }

}
