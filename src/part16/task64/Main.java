package part16.task64;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(1_000_000);

        List<Integer> list = random.ints().limit(n).boxed().collect(Collectors.toList());


        int result = list.stream()
                .filter(Objects::nonNull)
                .filter(x -> (x % 3 == 0 & x % 5 == 0))
                .findFirst().orElse(0);
        if (result != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


        boolean f = list.stream()
                .filter(Objects::nonNull)
                .anyMatch(x -> (x % 3 == 0 & x % 5 == 0));
        if (f) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
