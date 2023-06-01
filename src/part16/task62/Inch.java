package part16.task62;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Inch {

        public static void main(String[] args) {

            double sum;

            List<Double> list = new ArrayList<>();
            for (int i = 1; i < 30; i++) {
                list.add((double) new Random().nextInt(30));

            }
            sum = list.stream()
                    .filter(x -> x % 2 == 0 & x >= 1 & x <= 20)
                    .peek(x -> System.out.println(x + " - inch"))
                    .map(x -> x * 2.54)
                    .mapToDouble(Double::doubleValue)
                    .sum();

            System.out.println("sum = " + sum + " cm");
        }
    }

