package part8.task33;

public class CookingAppliances extends Appliances implements Power{

    public CookingAppliances() {
        setApplianceType("Cooking");
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



