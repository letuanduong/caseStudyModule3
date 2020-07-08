package service.impl;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import repositories.ProductRepository;
import service.IService;

import java.util.List;

public class ProductServiceImpl implements IService<Product> {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<Product> findAll() {
        List<Product> products = (List<Product>) productRepository.findAll();
        return products;
    }

    @Override
    public Product findById(Long id) {
        Product product = productRepository.findOne(id);
        return product;
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void remove(Long id) {
        productRepository.delete(id);
    }
}
