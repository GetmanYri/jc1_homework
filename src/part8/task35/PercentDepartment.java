package part8.task35;

public enum PercentDepartment {
    DIRECTORATE(60), SALES_DEPARTMENT(30), BUILDER_DEPARTMENT(10);
    private final double percent;

    PercentDepartment(double percent) {
        this.percent = percent;
    }

    public double getPercent() {
        return percent;
    }
}
