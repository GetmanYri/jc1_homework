package part8.task35;

import util.Util;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Enter monthly plan and amount of company profit this month");
        MonthlyBonusAllCompany bonus = new MonthlyBonusAllCompany(10000, 20000);
        System.out.println("Bonus amount for department: ");
        Directorate directorate = new Directorate(bonus.getMonthlyBonusAllCompany());
        SalesDepartment sales = new SalesDepartment(bonus.getMonthlyBonusAllCompany());
        BuilderDepartment builder = new BuilderDepartment(bonus.getMonthlyBonusAllCompany());
        System.out.println("- " + directorate.getNameOfDepartment() + " = " + directorate.getMonthlyBonus());
        System.out.println("- " + sales.getNameOfDepartment() + " = " + sales.getMonthlyBonus());
        System.out.println("- " + builder.getNameOfDepartment() + " = " + builder.getMonthlyBonus());
        System.out.println();

        Directorate[] employeeDirHourPercent = {new Director("Boris", directorate.getMonthlyBonus()),
                new DeputeDirector("Vova", directorate.getMonthlyBonus()),
                new DeputeDirector("Bob", directorate.getMonthlyBonus())};
        for (Directorate employee : employeeDirHourPercent) {
            //System.out.println("Enter the number of working hours for - " + employee.getName());
            employee.payroll(150, (double) 100 / employeeDirHourPercent.length, directorate.getMonthlyBonus());
            System.out.println();
        }

        Directorate[] employeeDirHour = {
                new Cleaner("Anna", directorate.getMonthlyBonus()),
                new Cleaner("Polina", directorate.getMonthlyBonus()),
        };
        for (Directorate employee : employeeDirHour) {
            //System.out.println("Enter the number of working hours for - " + employee.getName());
            employee.payroll(200);
            System.out.println();
        }

        SalesDepartment[] employeeSales = {
                new TopManager("Alex", sales.getMonthlyBonus()),
                new Manager("Olya", sales.getMonthlyBonus())
        };
        for (SalesDepartment employee : employeeSales) {
            employee.payroll((double) 100 / employeeSales.length, sales.getMonthlyBonus());
            System.out.println();
        }

        BuilderDepartment[] employeeBuilder = {
                new Installer("Roma", builder.getMonthlyBonus()),
                new Installer("Nik", builder.getMonthlyBonus()),
                new ServiceMan("Dima", builder.getMonthlyBonus())
        };
        for (BuilderDepartment employee : employeeBuilder) {
            employee.payroll((double) 100 / employeeBuilder.length, builder.getMonthlyBonus());
            System.out.println();
        }
    }
}
