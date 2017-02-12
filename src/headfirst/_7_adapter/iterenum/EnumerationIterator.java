package headfirst._7_adapter.iterenum;
/**
 * Created by WORK_WERT on 12.02.2017.
 */

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator {
    Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public Object next() {
        return enumeration.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}