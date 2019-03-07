package ru.firsov.repository;

import ru.firsov.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends PagingAndSortingRepository<Product, Long> {
    @Query("SELECT p FROM Product p WHERE id = 1")
    Product findWithIdOne();
}
