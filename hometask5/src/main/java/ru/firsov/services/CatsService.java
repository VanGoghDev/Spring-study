package ru.firsov.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.firsov.entity.Cat;
import ru.firsov.repository.CatsRepository;

import java.util.List;

@Service
public class CatsService {
    private CatsRepository catsRepository;

    @Autowired
    public void setCatsRepository(CatsRepository catsRepository) {
        this.catsRepository = catsRepository;
    }

    public List<Cat> getAllCats() {
        return (List<Cat>)catsRepository.findAll();
    }

    public Cat getById(Long id) {
        return catsRepository.findById(id).orElse(null);
    }

    public Cat save(Cat cat) {
        cat.setId(0L);
        return catsRepository.save(cat);
    }

    public Cat update(Cat cat) {
        return catsRepository.save(cat);
    }

    public int delete(Cat cat) {
        catsRepository.deleteById(cat.getId());
        return 200;
    }
}
