package com.iqmsoft;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.LinkedList;
import java.util.List;

@Controller
public class HelloWorldController {

//    @GetMapping("/")
//    public ModelAndView index() {
//        ModelAndView modelAndView = new ModelAndView("index");
//
//        Person person = new Person();
//        person.setName("Diogo");
//        person.setGender('M');
//
//        Person person1 = new Person();
//        person1.setName("Etc");
//        person1.setGender('M');
//
//        List<Person> persons = new LinkedList<>();
//        persons.add(person);
//        persons.add(person1);
//
//        modelAndView.addObject("persons", persons);
//        return modelAndView;
//    }

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        Person person = new Person();
        modelAndView.addObject("person", person);
        return modelAndView;
    }

    @PostMapping("/hello")
    public ModelAndView hello(@ModelAttribute Person person) {
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("person", person);
        return modelAndView;
    }

}