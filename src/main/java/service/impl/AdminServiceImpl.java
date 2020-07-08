package service.impl;

import model.Admin;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import service.IService;

import java.util.List;

public class AdminServiceImpl implements IService<Admin> {
    @Override
    public List<Admin> findAll() {
        return null;
    }

    @Override
    public Admin findById(Long id) {
        return null;
    }

    @Override
    public void save(Admin admin) {

    }

    @Override
    public void remove(Long id) {

    }
}
