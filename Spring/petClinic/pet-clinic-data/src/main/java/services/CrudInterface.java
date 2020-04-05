package services;

import java.util.Set;

public interface CrudInterface <T, Long>{
    Set<T> findAll();
    void deleteById(Long id);
    void delete(T object);
    T findById(Long id);
    T save (T object);

}
