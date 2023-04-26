package part9.task36;

public class Main {
    public static void main(String[] args) {
        EnumSeason winter = EnumSeason.WINTER;
        EnumSeason spring = EnumSeason.SPRING;
        EnumSeason summer = EnumSeason.SUMMER;
        EnumSeason autumn = EnumSeason.AUTUMN;

        System.out.println("Now - " + winter.getDescription() + ", count of days - " + winter.getCountOfDays());
        System.out.println("Now - " + spring.getDescription() + ", count of days - " + spring.getCountOfDays());
        System.out.println("Now - " + summer.getDescription() + ", count of days - " + summer.getCountOfDays());
        System.out.println("Now - " + autumn.getDescription() + ", count of days - " + autumn.getCountOfDays());

    }
}
