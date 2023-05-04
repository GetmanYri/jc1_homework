package part10.task41;

import java.util.*;

public class SetCollection {
    public static <list> void main(String[] args) {

        // Solution one:
        System.out.println("Solution one:");
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 50; i++) {
            set.add((int) (Math.random() * 50));
        }
        System.out.println("Set size = " + set.size());

        for (Integer integer : set) {
            System.out.print(integer + " ");
        }

        // Solution two:
        System.out.println("\n\n Solution two:");
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < 50; i++) {
            list.add((int) (Math.random() * 50));
        }
        System.out.println("List size = " + list.size());
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

        for (int i = 0; i < list.size(); i++) {
            Iterator<Integer> iterator = list.iterator();

            while (iterator.hasNext()) {
                int next = iterator.next();

                if (i == list.lastIndexOf(next)) {
                    continue;
                }
                if (list.get(i) == next) {
                    iterator.remove();
                }
            }
        }
        System.out.println("\nList size = " + list.size());
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
