package ru.firsov.spring;

public class ProductRepository {
    public Product getProductById(Long id) {
        Product product = new Product();
        product.setId(id);
        product.setTitle("new item" + id);
        return product;
    }
}
