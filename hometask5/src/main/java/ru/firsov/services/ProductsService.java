package ru.firsov.services;

import ru.firsov.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.firsov.repository.ProductsRepository;

import java.util.List;

@Service
public class ProductsService {
    private ProductsRepository productsRepository;

    @Autowired
    public void setProductsRepository(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public List<Product> getAllProducts() {
        return (List<Product>)productsRepository.findAll();
    }

   /* public Product saveOrUpdate(Product product) {
        return productsRepository.save(product);
    }*/
}
