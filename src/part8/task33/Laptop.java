package part8.task33;

public class Laptop extends Media {
    private int timerOn;

    public Laptop(String brandName,int electricalPower) {
        super();
        setBrandName(brandName);
        setElectricalPower(electricalPower);
    }

    public void setTimerOn(int timerOn) {
        this.timerOn = timerOn;
    }
}
