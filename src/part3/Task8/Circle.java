package part3.Task8;


public class Circle {

    public static void main(String[] args) {
        int sideA = Integer.parseInt(args[0]);
        int sideB = Integer.parseInt(args[1]);
        int radius = Integer.parseInt(args[2]);
        if ((Math.sqrt((Math.pow(sideA, 2) + Math.pow(sideB, 2))) >= radius)) {
            System.out.println("Круг не перекрывает прямоугольник");
        } else {
            System.out.println("Круг перекрывает прямоугольник");
        }

    }

}

