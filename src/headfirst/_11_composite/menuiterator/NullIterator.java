package headfirst._11_composite.menuiterator;
/**
 * Created by WERT on 16.02.2017.
 */

import java.util.Iterator;

public class NullIterator implements Iterator {

    public Object next() {
        return null;
    }

    public boolean hasNext() {
        return false;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}