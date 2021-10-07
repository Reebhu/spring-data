package com.springFrameworkDemo.springwebapp.controller;

import com.springFrameworkDemo.springwebapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {
    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/author/{id}")
    String getAuthor(Model model, @PathVariable("id") long id) {
        model.addAttribute("author", authorRepository.findById(id));
        return "authors/author";
    }
    @RequestMapping("/authors")
    String getAuthor(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        return "authors/lists";
    }

}
