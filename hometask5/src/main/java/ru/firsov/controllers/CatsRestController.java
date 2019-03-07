package ru.firsov.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.firsov.entity.Cat;
import ru.firsov.services.CatsService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CatsRestController {
    private CatsService catsService;

    @Autowired
    public void setCatsService(CatsService catsService) {
        this.catsService = catsService;
    }

    @GetMapping("/cats")
    public List<Cat> getAllCats() {
        return catsService.getAllCats();
    }

    @GetMapping("/cats/{id}")
    public Cat getOneCat(@PathVariable("id") Long id) {
        return catsService.getById(id);
    }

    @PostMapping("/cats")
    public Cat addNewCat(@RequestBody Cat cat) {
        return catsService.save(cat);
    }

    @PutMapping("/cats")
    public Cat updateCat(@RequestBody Cat cat) {
        return catsService.update(cat);
    }

    @DeleteMapping("/cats")
    public int deleteCat(@RequestBody Cat cat) {
        return catsService.delete(cat);
    }
}
