package part8.task33;

public class CleanerAppliances extends Appliances {
    public CleanerAppliances() {
        setApplianceType("Cleaner");
    }

    @Override
    void powerOn() {
        setStatus("On");
    }

    @Override
    void powerOff() {
        setStatus("Off");

    }
}



