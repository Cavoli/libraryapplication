package com.mylibrary.libraryapplication.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "books")
public class Book extends NamedEntity{

    @Column(name = "author")
    private String author;

    @ManyToOne
    @Column(name = "owner_id")
    private Owner owner;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "book_genres", joinColumns = @JoinColumn(name = "vet_id"),
        inverseJoinColumns = @JoinColumn(name= "genre_id"))
    private Set<Genre> genre;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "book", fetch = FetchType.EAGER)
    @Column(name = "rented_book")
    private RentedBook rentedBook;

}
