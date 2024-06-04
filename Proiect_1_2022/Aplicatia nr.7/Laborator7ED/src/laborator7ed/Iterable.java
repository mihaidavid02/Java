package laborator7ed;

import java.util.Iterator;

public interface Iterable {
    abstract <T> Iterator ExtraIterator(T collection);
}
