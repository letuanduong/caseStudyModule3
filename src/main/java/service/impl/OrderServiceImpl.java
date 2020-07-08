package service.impl;

import model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import service.IService;

import java.util.List;

public class OrderServiceImpl implements IService<Order> {
    @Override
    public List<Order> findAll() {
        return null;
    }

    @Override
    public Order findById(Long id) {
        return null;
    }

    @Override
    public void save(Order order) {

    }

    @Override
    public void remove(Long id) {

    }
}
