package part8.task35;

public class TopManager extends SalesDepartment  {

    public TopManager(String name, double monthlyBonus) {
        super(monthlyBonus);
        setName(name);
        setRatePerHour(70);

    }

}
