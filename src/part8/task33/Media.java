package part8.task33;

public class Media extends Appliances implements Power {

    public Media() {
        setApplianceType("Media");
    }

    @Override
    public void powerOn() {
        setStatus("On");
    }

    @Override
    public void powerOff() {
        setStatus("off");
    }
}
