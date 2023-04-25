package part8.task33;

public class Main {
    public static void main(String[] args) {

        VacuumCleaner cleaner = new VacuumCleaner("Panasonic", 1500);
        WashingMachine wash = new WashingMachine("Bosch", 2000);
        Grill grill = new Grill("Redmond", 3000);
        Tv tv = new Tv("Samsung", 500);

        tv.powerOn();
        grill.powerOff();
        cleaner.powerOn();
        wash.powerOff();

        System.out.println("Tv " + tv.getBrandName() + " now is " + tv.getStatus() + ", electrical power - " + tv.getElectricalPower() + " W");
        System.out.println("Grill " + grill.getBrandName() + " now is " + grill.getStatus() + ", electrical power - " + grill.getElectricalPower() + " W");
        System.out.println("Vacuum cleaner  " + cleaner.getBrandName() + " now is " + cleaner.getStatus() + ", electrical power - " + cleaner.getElectricalPower() + " W");
        System.out.println("Washing machine  " + wash.getBrandName() + " now is " + wash.getStatus() + ", electrical power - " + wash.getElectricalPower() + " W");
    }
}
