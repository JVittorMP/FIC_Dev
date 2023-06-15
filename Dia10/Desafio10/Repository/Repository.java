package Dia10.Desafio10.Repository;

import java.util.List;

public interface Repository<T> {
    
    void insert(T object);
    
    void update(T object);
    
    void delete(T object);

    T get(int idx);
    
    List<T> select();
    
}
