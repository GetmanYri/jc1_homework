package part9.task39;

import util.Util;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter name of motorcycle");
        Garage<Vehicle> garage1 = new Garage<>(new Motorcycle(Util.scannerString()));
        System.out.println("Enter name of motorcycle");
        Garage<Vehicle> garage2 = new Garage<>(new Car(Util.scannerString()));

        System.out.print("In the garage1 - ");
        garage1.printName();
        System.out.print("In the garage2 - ");
        garage2.printName();
    }
}
