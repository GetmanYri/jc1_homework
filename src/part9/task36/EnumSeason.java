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
}
