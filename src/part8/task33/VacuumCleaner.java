package part8.task33;

public class VacuumCleaner extends CleanerAppliances {

    private boolean isFilterClogged;

    public VacuumCleaner(String brandName, int electricalPower) {
        super();
        setBrandName(brandName);
        setElectricalPower(electricalPower);
    }

    public void setFilterClogged(boolean filterClogged) {
        isFilterClogged = filterClogged;
    }

    public boolean isFilterClogged() {
        return isFilterClogged;
    }
}

