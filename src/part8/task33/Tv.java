package part8.task33;

public class Tv extends Media{
    private int volume;

    public Tv(String brandName,int electricalPower) {
        super();
        setBrandName(brandName);
        setElectricalPower(electricalPower);
    }

    public void setVolume(int volume){
        this.volume=volume;
    }

    public int getVolume() {
        return volume;
    }
}
