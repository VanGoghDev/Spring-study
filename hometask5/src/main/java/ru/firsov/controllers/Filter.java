package ru.firsov.controllers;

import lombok.Data;
import org.springframework.ui.Model;
import ru.firsov.entity.Product;

import java.util.List;

@Data
public class Filter {
    private int minPrice = 0;
    private int maxPrice = 0;

    /*public String showHomePage(Model model) {
        List<Product> productList =
    }*/
}
