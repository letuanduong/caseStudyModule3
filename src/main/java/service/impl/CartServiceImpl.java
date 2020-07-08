package service.impl;

import model.Cart;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import service.IService;

import java.util.List;

public class CartServiceImpl implements IService<Cart> {
    @Override
    public List<Cart> findAll() {
        return null;
    }

    @Override
    public Cart findById(Long id) {
        return null;
    }

    @Override
    public void save(Cart cart) {

    }

    @Override
    public void remove(Long id) {

    }
}
