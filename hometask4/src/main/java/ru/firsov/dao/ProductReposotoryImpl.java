package ru.firsov.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.firsov.entities.Product;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class ProductReposotoryImpl implements ProductRepositoryCustom{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Product> getByName(String name) {
        return null;
    }

    @Override
    public List<Product> getMaxPrice() {
        Query query = entityManager.createNativeQuery("SELECT product FROM product_dz WHERE product.price = MAX;", Product.class);
        return query.getResultList();
    }
}
