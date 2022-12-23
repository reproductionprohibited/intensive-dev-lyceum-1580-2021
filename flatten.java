import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Flatten {
    public static Object[] flatten(Object[] sourceArray) {
        ArrayList<Object> flattenArrayList = new ArrayList<>();
        for(Object elem: sourceArray) {
            if (elem instanceof Object[]) {
                flattenArrayList.addAll(Arrays.asList(flatten((Object[]) elem)));
            } else {
                flattenArrayList.add(elem);
            }
        }
        return flattenArrayList.toArray();
    }

    public static void main(String[] args) {
        Object[] a = new Object[] {1, 2, 3, 4, new Object[] {5, 7, 2, new Object[] {"Some String", 'c'}}};
        for(Object item: flatten(a)) {
            System.out.print(item + "; ");
        }
    }
}
