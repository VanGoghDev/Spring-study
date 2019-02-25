package ru.firsov.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.firsov.entities.Product;

import java.util.List;

@Repository
public interface ProductHibRepository extends CrudRepository<Product, Long> {
    List<Product> findAllByCost(int cost);
}
