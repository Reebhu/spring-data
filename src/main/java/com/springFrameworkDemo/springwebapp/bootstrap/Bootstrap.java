package com.springFrameworkDemo.springwebapp.bootstrap;

import com.springFrameworkDemo.springwebapp.enities.Author;
import com.springFrameworkDemo.springwebapp.enities.Book;
import com.springFrameworkDemo.springwebapp.repositories.AuthorRepository;
import com.springFrameworkDemo.springwebapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
public class Bootstrap implements CommandLineRunner {
    AuthorRepository authorRepository;
    BookRepository bookRepository;
    public Bootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }
    @Override
    public void run(String... args) {
        Author murakami = new Author("Haruki","Murakami");
        Book kafkaOnShore = new Book("Kafka On Shore", "123565");

        bookRepository.save(kafkaOnShore);
        authorRepository.save(murakami);


        Author valmiki = new Author("Santh","Valmiki");
        Author tulsidas = new Author("Kavi","Tulsidas");
        Book ramayana = new Book("Ramayana", "97652175");
        ramayana.addAuthors(valmiki, tulsidas);

        bookRepository.save(ramayana);
        authorRepository.save(valmiki);
        authorRepository.save(tulsidas);

        System.out.println("Saved");
    }
}
