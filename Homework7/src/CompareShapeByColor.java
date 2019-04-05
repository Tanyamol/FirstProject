import java.util.Comparator;

public class CompareShapeByColor implements Comparator {
    public int compare(Object o1, Object o2) {
        String name1 = ((Shape)o1).getColor();
        String name2 = ((Shape)o2).getColor();
        return name1.compareTo(name2);
    }
}
