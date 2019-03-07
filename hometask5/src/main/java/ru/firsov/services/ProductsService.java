package ru.firsov.services;

import ru.firsov.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.firsov.repository.ProductsRepository;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
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

    public Product saveOrUpdate(Product product) {
        return productsRepository.save(product);
    }

    public double getMinPrice() {
        List<Double> prices = new LinkedList<>();
        for (int i = 0; i < getAllProducts().size(); i++) {
            prices.add(getAllProducts().get(i).getCost());
            double minPrice = Collections.min(prices);
            return minPrice;
        }
        return 0;
    }

    public double getMaxPrice() {
        List<Double> prices = new LinkedList<>();
        for (int i = 0; i < getAllProducts().size(); i++) {
            prices.add(getAllProducts().get(i).getCost());
            double maxPrice = Collections.max(prices);
            return maxPrice;
        }
        return 0;
    }

    /*public List<Product> getProductsByPriceRange(int min, int max) {
        return productsRepository
    }*/
}
