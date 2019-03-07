package ru.firsov.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.firsov.entity.Cat;

@Repository
public interface CatsRepository extends CrudRepository<Cat, Long> {
}
