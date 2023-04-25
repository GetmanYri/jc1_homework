package part8.task35;

public class Manager extends SalesDepartment {
    public Manager(String name, double monthlyBonus) {
        super(monthlyBonus);
        setName(name);
        setRatePerHour(50);
    }
}
