package com.springFrameworkDemo.springwebapp.enities;

import javax.persistence.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Table(name = "Book", indexes = {
        @Index(name = "idx_book_book_id", columnList = "book_id")
})
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id", nullable = false)
    private Long bookId;

    private String name;
    private String isdn;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "book_authors",
            joinColumns = @JoinColumn(name = "book_book_id"),
            inverseJoinColumns = @JoinColumn(name = "authors_author_id"))
    private Set<Author> authors = new HashSet<>();

//    @ManyToMany
//    @JoinTable(name = "author_book", joinColumns = {
//            @JoinColumn(name = "book_id")
//    }, inverseJoinColumns = {@JoinColumn(name = "author_id")})
//    private Set<Author> authors = new HashSet<>();


    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Book(String name, String isdn) {
        this.name = name;
        this.isdn = isdn;
    }

    public Book() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookId, book.bookId) && Objects.equals(name, book.name) && Objects.equals(isdn, book.isdn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, name, isdn);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsdn() {
        return isdn;
    }

    public void setIsdn(String isdn) {
        this.isdn = isdn;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void addAuthors(Author... authors) {
        this.authors.addAll(Arrays.asList(authors));
    }
}
