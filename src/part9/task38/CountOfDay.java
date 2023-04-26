package part9.task38;

import part9.task36.EnumSeason;

public class CountOfDay {
    public static void countOfDay(String nameOfSeason) {

        switch (nameOfSeason.toUpperCase()) {
            case "WINTER":
            case "SPRING":
            case "SUMMER":
            case "AUTUMN":
                System.out.println("Number of days in " +
                        EnumSeason.valueOf(nameOfSeason.toUpperCase()).getDescription().toLowerCase() + " - " +
                        EnumSeason.valueOf(nameOfSeason.toUpperCase()).getCountOfDays());
                if (nameOfSeason.compareToIgnoreCase("winter") == 0) {
                    System.out.println("If the year is a leap year, number of days in " +
                            EnumSeason.valueOf(nameOfSeason.toUpperCase()).getDescription().toLowerCase() + " - " +
                            (EnumSeason.WINTER.getCountOfDays() + 1));
                }
                break;
            case "1":
                System.out.println("Number of days in " +
                        EnumSeason.WINTER.getDescription().toLowerCase() + " - " +
                        EnumSeason.WINTER.getCountOfDays());
                System.out.println("If the year is a leap year, number of days in " +
                        EnumSeason.WINTER.getDescription().toLowerCase() + " - " +
                        (EnumSeason.WINTER.getCountOfDays() + 1));
                break;
            case "2":
                System.out.println("Number of days in " +
                        EnumSeason.SPRING.getDescription().toLowerCase() + " - " +
                        EnumSeason.SPRING.getCountOfDays());
                break;
            case "3":
                System.out.println("Number of days in " +
                        EnumSeason.SUMMER.getDescription().toLowerCase() + " - " +
                        EnumSeason.SUMMER.getCountOfDays());
                break;
            case "4":
                System.out.println("Number of days in " +
                        EnumSeason.AUTUMN.getDescription().toLowerCase() + " - " +
                        EnumSeason.AUTUMN.getCountOfDays());
                break;
            default:
                System.out.println("Error Enter");
        }
    }
}
