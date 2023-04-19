package part8.task33;

public class CookingAppliances extends Appliances {

    public CookingAppliances() {
        setApplianceType("Cooking");
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



