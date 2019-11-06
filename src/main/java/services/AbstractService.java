package services;

import java.util.Collection;

public interface AbstractService<T> {
    void save(T object);

    void remove(T object);

    T getById();

    Collection<T> getAll();
}
