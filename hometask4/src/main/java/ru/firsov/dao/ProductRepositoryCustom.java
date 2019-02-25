package ru.firsov.dao;

import ru.firsov.entities.Product;

import java.util.List;

public interface ProductRepositoryCustom {
    List<Product> getByName(String name);
    List<Product> getMaxPrice();
}
