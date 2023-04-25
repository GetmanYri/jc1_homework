package part8.task35;

public class ServiceMan extends BuilderDepartment {
    public ServiceMan(String name, double monthlyBonus) {
        super(monthlyBonus);
        setName(name);
        setRatePerHour(50);
    }
}
