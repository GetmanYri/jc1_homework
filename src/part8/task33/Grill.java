package part8.task33;

public class Grill extends CookingAppliances{
    private int temperatureRegulator;
    public Grill(String brandName,int electricalPower) {
        super();
        setBrandName(brandName);
        setElectricalPower(electricalPower);
    }
    public void setTemperatureRegulator(int temperatureRegulator){
        this.temperatureRegulator=temperatureRegulator;
    }
}
