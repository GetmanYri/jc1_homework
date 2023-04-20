package part8.task33;

public abstract class Appliances {

    private String brandName;
    private String applianceType;
    private String status;
    private int electricalPower;


    //abstract void powerOn();

    //abstract void powerOff();

    public String getBrandName() {
        return brandName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getApplianceType() {
        return applianceType;
    }

    public void setApplianceType(String applianceType) {
        this.applianceType = applianceType;
    }

    public int getElectricalPower() {
        return electricalPower;
    }

    public void setElectricalPower(int electricalPower) {
        this.electricalPower = electricalPower;
    }
}
