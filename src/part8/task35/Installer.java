package part8.task35;

public class Installer extends BuilderDepartment {
    public Installer(String name, double monthlyBonus) {
        super(monthlyBonus);
        setName(name);
        setRatePerHour(30);
    }
}
