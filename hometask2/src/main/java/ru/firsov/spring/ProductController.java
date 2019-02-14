package ru.firsov.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) { this.productService = productService; }

    @RequestMapping("/showForm")
    public String showSimpleForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "product-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Product product) {
        System.out.println(product.getTitle());
        return "product-form-result";
    }

    @RequestMapping(path="/showStudentById", method= RequestMethod.GET)
    public String showStudentById(Model model, @RequestParam Long id) {
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "product-form-result";
    }
}
