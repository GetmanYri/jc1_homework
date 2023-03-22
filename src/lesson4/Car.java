package lesson4;

import java.awt.*;

public class Car {
    Color color;
    String model;

    public Car(int price) {
        System.out.println(price);
    }

    public static void main(String[] args) {
        Car bmwX6, audiA8;

        bmwX6 = new Car(10);
        bmwX6.color = Color.BLACK;
        bmwX6.model = "BMW X6";

        Car bmw_second=bmwX6;
        //bmwX6=null;
        System.out.println(bmw_second.model+" "+bmw_second.color);
        System.out.println(bmwX6.model+" "+bmwX6.color);

        audiA8 = new Car(15);
        audiA8.color = Color.GREEN;
        audiA8.model = "Audi A8";
    }
}
