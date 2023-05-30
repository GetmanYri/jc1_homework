package part15.task60;

import java.util.*;
import java.util.concurrent.Callable;

public class CallableTenNum implements Callable<String> {
    private List<Integer> list;
    String num;

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " start in Call");
        list = Collections.synchronizedList(new ArrayList<>());
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(100));
        }
        Thread.sleep(new Random().nextInt(10_000));
        num = Integer.toString(list.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .sum());
        System.out.println(Thread.currentThread().getName() + " end in Call");
        return num;
    }
}
