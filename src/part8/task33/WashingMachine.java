package part8.task33;

public class WashingMachine extends CleanerAppliances {

    private boolean isDishDetergent;

    public WashingMachine(String brandName, int electricalPower) {
        super();
        setBrandName(brandName);
        setElectricalPower(electricalPower);
    }

    public boolean isDishDetergent() {
        return isDishDetergent;
    }

    public void setDishDetergent(boolean dishDetergent) {
        isDishDetergent = dishDetergent;
    }
}
