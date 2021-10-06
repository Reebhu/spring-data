package com.springFrameworkDemo.springwebapp.repositories;

import com.springFrameworkDemo.springwebapp.enities.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
