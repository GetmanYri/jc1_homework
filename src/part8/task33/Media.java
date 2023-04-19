package part8.task33;

public class Media extends Appliances {

    public Media() {
        setApplianceType("Media");
    }

    @Override
    void powerOn() {
        setStatus("On");
    }

    @Override
    void powerOff() {
        setStatus("off");
    }
}
