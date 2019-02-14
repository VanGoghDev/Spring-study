package ru.firsov.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProductById(Long id) {
        Product product = productRepository.getProductById(id);
        return product;
    }
}
