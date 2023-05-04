package part10.task40;

import java.util.Iterator;
import java.util.List;

public class PoorGrades {
    public static void deletePoorGrades(List<Student> list) {
        Iterator<Student> delete = list.iterator();

        while (delete.hasNext()) {
            if (delete.next().getGrade() <= 5) {
                delete.remove();
            }
        }
    }
}
