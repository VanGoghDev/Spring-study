package ru.firsov.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.firsov.entities.Product;

@Repository
public interface ProductsRepository extends PagingAndSortingRepository<Product, Long> {
    @Query("SELECT p FROM Product p WHERE id = 1;")
    Product findWithIdOne();
}
