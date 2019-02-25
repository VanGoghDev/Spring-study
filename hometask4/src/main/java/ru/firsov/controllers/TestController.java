package ru.firsov.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.firsov.dao.ProductRepository;
import ru.firsov.entities.Product;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping("/product")
    public List<Product> getTest() {
        return productRepository.findAll();
    }

    @RequestMapping("/product/filter")
    public List<Product> getFiltered() {
        return productRepository.getMaxPrice();
    }
}
