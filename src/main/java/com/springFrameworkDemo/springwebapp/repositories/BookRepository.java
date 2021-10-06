package com.springFrameworkDemo.springwebapp.repositories;

import com.springFrameworkDemo.springwebapp.enities.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

public interface BookRepository  extends CrudRepository<Book,Long> {
}
