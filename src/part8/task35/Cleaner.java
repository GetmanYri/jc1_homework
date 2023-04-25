package part8.task35;

public class Cleaner extends Directorate{
    public Cleaner(String name, double monthlyBonus) {
        super(monthlyBonus);
        setName(name);
        setRatePerHour(5);
    }
}
