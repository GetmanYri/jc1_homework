package part9.task39;

public class Garage<T extends Vehicle> {
    private T vehicle;

    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }

    public void printName() {
        System.out.println(vehicle.getName());
    }
}
