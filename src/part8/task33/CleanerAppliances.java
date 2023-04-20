package part8.task33;

public class CleanerAppliances extends Appliances implements Power{


        public CleanerAppliances() {
        setApplianceType("Cleaner");
    }

    @Override
    public void powerOn() {
        setStatus("On");
    }

    @Override
    public void powerOff() {
        setStatus("Off");

    }
}



