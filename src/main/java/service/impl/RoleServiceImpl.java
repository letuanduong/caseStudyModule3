package service.impl;

import model.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import service.IService;

import java.util.List;

public class RoleServiceImpl implements IService<Role> {
    @Override
    public List<Role> findAll() {
        return null;
    }

    @Override
    public Role findById(Long id) {
        return null;
    }

    @Override
    public void save(Role role) {

    }

    @Override
    public void remove(Long id) {

    }
}
