package ru.firsov.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.firsov.dao.ProductHibRepository;
import ru.firsov.entities.Product;

@Controller
public class MainController {
    @Autowired
    ProductHibRepository productHibRepository;

    @RequestMapping("/app")
    public String showHomePage() {
        System.out.println(productHibRepository.findAll());

        //Page<Product> page = productHibRepository.findAllByCost(PageRequest.of(2, 2), 30);
        return "index";
    }

    /*@RequestMapping(path = "/getMaxCost", method= RequestMethod.GET)
    @ResponseBody
    public Product getProductByMax(@PathVariable("sid") int cost) {
        productHibRepository.

    }*/
}
