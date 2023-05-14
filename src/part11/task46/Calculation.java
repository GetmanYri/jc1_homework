package part11.task46;

public class Calculation {
public static void calculation(int sideA,int sideB,int radius){
    if ((Math.sqrt((Math.pow(sideA, 2) + Math.pow(sideB, 2))) >= radius)) {
        System.out.println("Круг не перекрывает прямоугольник");
    } else {
        System.out.println("Круг перекрывает прямоугольник");
    }
}
}
