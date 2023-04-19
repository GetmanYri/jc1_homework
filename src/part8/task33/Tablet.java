package part8.task33;

public class Tablet extends Media{
    private int chargeOn;

    public Tablet(String brandName,int electricalPower) {
        super();
        setBrandName(brandName);
        setElectricalPower(electricalPower);
    }

    public void setChargeOn(int chargeOn) {
        this.chargeOn = chargeOn;
    }
}
