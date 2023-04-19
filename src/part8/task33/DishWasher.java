package part8.task33;

public class DishWasher extends CleanerAppliances{

    private boolean isFull;
    public DishWasher(String brandName,int electricalPower) {
        super();
        setBrandName(brandName);
        setElectricalPower(electricalPower);
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }
}
