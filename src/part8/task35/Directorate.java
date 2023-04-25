package part8.task35;

public class Directorate extends Company implements Payroll {
    public Directorate(double monthlyBonus) {
        setNameOfDepartment("Directorate");
        PercentDepartment percent = PercentDepartment.DIRECTORATE;
        setMonthlyBonus(monthlyBonus, percent.getPercent());
    }

    @Override
    public void payroll(double hour, double percent, double bonusAmount) {
        if (hour < 0 | bonusAmount < 0 | percent < 0) {
            System.out.println("Error enter");
            System.exit(1);
        }
        System.out.print(getName() + ", ");
        if (hour != 0) {
            setPayroll(getRatePerHour() * hour);
            System.out.println("in this month you worked - " + hour + " hours. Your salary (hour) this month is - " + getPayroll() +
                    "$");
        }
        if (bonusAmount != 0) {
            setPayroll(bonusAmount * (percent / 100));
            System.out.println("Your bonus in this month is - " + (int) getPayroll() + "$");
        }
    }

    @Override
    public void payroll(double hour) {
        payroll(hour, 0, 0);
    }

    @Override
    public void payroll(double percent, double bonusAmount) {
        payroll(0, percent, bonusAmount);
    }
}


