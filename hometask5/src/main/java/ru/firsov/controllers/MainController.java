package ru.firsov.controllers;

import ru.firsov.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.firsov.services.ProductsService;

import java.util.List;


@Controller
public class MainController {
    private ProductsService productsService;

    @Autowired
    public void setProductsService(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("/")
    public String showHomePage(Model model) {
        List<Product> allProducts = productsService.getAllProducts();
        model.addAttribute("products", allProducts);
        return "index";
    }

/*    @GetMapping("/info")
    public String showInfoPage(Model model) {
        return "info";
    }

    @GetMapping("/product/add")
    public String addProductPage(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "add-product";
    }

    @PostMapping("/product/add")
    public String addProduct(Model model, @ModelAttribute("product") Product product) {
        productsService.saveOrUpdate(product);
        return "redirect:/";
    }*/
}
