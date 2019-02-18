package ru.firsov.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.firsov.entity.Person;
import ru.firsov.repositories.PersonRepository;
import ru.firsov.services.PersonService;

@Controller
@RequestMapping("/persons")
public class MainController {
    private PersonService personService;

    @Autowired
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }
    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }

    @GetMapping("/all")
    public String showAllPersons(Model model) {
        model.addAttribute("persons", personService.getAllPersons());
        return "person-list";
    }

    @RequestMapping("/formAddPerson")
    public String addPersonShow(Model model) {
        Person person = new Person();
        model.addAttribute("person", person);
        return "person-form";
    }

    @RequestMapping("/formAddPersonProcess")
    public String formAddPersonProcess(@ModelAttribute("person") Person person) {
        PersonService.addPerson(person);
        return "redirect:/products/all";
    }

}
