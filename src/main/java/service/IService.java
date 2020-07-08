package service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IService<T> {

    List<T> findAll();

    T findById(Long id);

    void save(T t);

    void remove(Long id);

}
