
import java.util.Comparator;

public class IdComparator implements Comparator<MyClass> {

    @Override
    public int compare(MyClass o1, MyClass o2) {
        if (o1.getId() == o2.getId()) {
            return 0;
        } else if (o1.getId() < o2.getId()) {
            return -1;
        } else
            return 1;
    }
}
