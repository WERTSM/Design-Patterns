package headfirst._7_adapter.iterenum;
/**
 * Created by WORK_WERT on 12.02.2017.
 */

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationIteratorTestDrive {
    public static void main(String args[]) {
        Vector v = new Vector(Arrays.asList(args));
        Iterator iterator = new EnumerationIterator(v.elements());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}