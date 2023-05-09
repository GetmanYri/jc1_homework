package part9.task36;

public enum EnumSeason {
    WINTER("Winter", 90),
    SPRING("Spring", 92),
    SUMMER("Summer", 92),
    AUTUMN("Autumn", 91);
    private int countOfDays;
    private String description;

    EnumSeason(String description, int countOfDays) {
        this.countOfDays = countOfDays;
        this.description = description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public String getDescription() {
        return description;
    }

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
