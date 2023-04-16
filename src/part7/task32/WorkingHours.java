package part7.task32;

import java.time.Duration;
import java.time.Instant;

public class WorkingHours {
    public static void main(String[] args) {
        String string = "aaabbbccc";
        StringBuilder stringBuilder = new StringBuilder();

        Instant startString = Instant.now();

        for (int i = 0; i <= 1_000_000; i++) {
            string += "aaabbbccc";
        }

        Instant finishString = Instant.now();

        Instant startStringBuilder = Instant.now();

        for (int i = 0; i <= 1_000_000; i++) {
            stringBuilder.append("aaabbbccc");
        }

        Instant finishStringBuilder = Instant.now();
        long allMillisString= Duration.between(startString,finishString).toMillis();
        long allMillisStringBuilder= Duration.between(startStringBuilder,finishStringBuilder).toMillis();

        System.out.println("Time of String = "+allMillisString);
        System.out.println("Time of StringBuilder = "+allMillisStringBuilder);
    }

}
