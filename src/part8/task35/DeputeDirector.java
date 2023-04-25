package part8.task35;

public class DeputeDirector extends Directorate {
    public DeputeDirector(String name, double monthlyBonus) {
        super(monthlyBonus);
        setName(name);
        setRatePerHour(70);
    }
}
