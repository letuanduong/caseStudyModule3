package service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import service.IService;

import java.util.List;

public class CategoryServiceImpl implements IService<CategoryServiceImpl> {
    @Override
    public List<CategoryServiceImpl> findAll() {
        return null;
    }

    @Override
    public CategoryServiceImpl findById(Long id) {
        return null;
    }

    @Override
    public void save(CategoryServiceImpl categoryService) {

    }

    @Override
    public void remove(Long id) {

    }
}
