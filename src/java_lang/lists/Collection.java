package java_lang.lists;

import java.util.Iterator;
import java.util.Objects;
import java.util.function.Predicate;

public interface Collection<T> {

    int size();

    boolean add(T var1);

    boolean addAll(Collection<? extends T> var1);

    boolean contains(T var1);

    boolean containsAll(Collection<?> var1);

    boolean remove(Object var1);

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

    public T get(int index);

    public T set(int index, T element);

    public T peek();

    Iterator<T> iterator();

    void clear();

    boolean equals(Object var1);

    String copyToString();
}