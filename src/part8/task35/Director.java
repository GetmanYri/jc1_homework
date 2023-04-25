package part8.task35;

public class Director extends Directorate  {

    public Director(String name, double monthlyBonus) {
        super(monthlyBonus);
        setName(name);
        setRatePerHour(100);
    }
}
