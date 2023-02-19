package Lesson_21;

import java.util.Comparator;

public class Compare implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String object1 = ((Person) o1).getName() + ((Person) o1).getSoname();
        String object2 = ((Person) o2).getName() + ((Person) o2).getSoname();
        return object1.compareTo(object2);
    }
}
