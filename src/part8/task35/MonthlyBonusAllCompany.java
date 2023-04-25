package part8.task35;

public class MonthlyBonusAllCompany {
    private double monthlyBonusAllCompany;

    public MonthlyBonusAllCompany(double monthlyPlan, double monthRevenue) {
        if (monthRevenue > monthlyPlan) {
            monthlyBonusAllCompany = monthRevenue - monthlyPlan;
            System.out.println("Company profit this month - " + monthlyBonusAllCompany);
        } else {
            monthlyBonusAllCompany = 0;
            System.out.println("Company profit this month - " + monthlyBonusAllCompany);
        }
    }


    public double getMonthlyBonusAllCompany() {
        return monthlyBonusAllCompany;
    }


}

