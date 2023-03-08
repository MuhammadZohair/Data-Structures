package java.singly_linked_list;

import java.util.List;

public interface CRUD<T> {

    void insert(T data);

    void insertAll(List<T> data);

    boolean update(T oldValue, T newValue);

    boolean delete(T data);

    boolean isEmpty();

    int sizeOfList();

    String copyToString();
}