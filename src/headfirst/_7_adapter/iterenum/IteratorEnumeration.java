package headfirst._7_adapter.iterenum;
/**
 * Created by WORK_WERT on 12.02.2017.
 */

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration implements Enumeration {
    Iterator iterator;

    public IteratorEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }

    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    public Object nextElement() {
        return iterator.next();
    }
}