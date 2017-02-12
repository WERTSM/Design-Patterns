package headfirst._7_adapter.iterenum;
/**
 * Created by WORK_WERT on 12.02.2017.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

public class IteratorEnumerationTestDrive {
    public static void main(String args[]) {
        ArrayList l = new ArrayList(Arrays.asList(args));
        Enumeration enumeration = new IteratorEnumeration(l.iterator());
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}