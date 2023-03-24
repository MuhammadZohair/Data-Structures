package java_lang.singly_linked_list;

import java.util.Iterator;
import java.util.Objects;
import java.util.function.Predicate;

public interface Collection<T> {

    int size();

    boolean contains(T var1);

    boolean add(T var1);

    boolean remove(Object var1);

    boolean containsAll(Collection<?> var1);

    boolean addAll(Collection<? extends T> var1);

    boolean removeAll(Collection<?> var1);

    default boolean removeIf(Predicate<? super T> filter) {
        Objects.requireNonNull(filter);
        boolean removed = false;
        Iterator<T> each = this.iterator();

        while (each.hasNext()) {
            if (filter.test(each.next())) {
                each.remove();
                removed = true;
            }
        }

        return removed;
    }

    Iterator<T> iterator();

    void clear();

    boolean equals(Object var1);

    String copyToString();
}