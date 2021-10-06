package com.springFrameworkDemo.springwebapp;

import com.springFrameworkDemo.springwebapp.enities.Author;
import com.springFrameworkDemo.springwebapp.enities.Book;
import com.springFrameworkDemo.springwebapp.repositories.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringwebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwebappApplication.class, args);
	}


}
