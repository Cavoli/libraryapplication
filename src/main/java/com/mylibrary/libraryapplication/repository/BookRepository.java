package com.mylibrary.libraryapplication.repository;

import com.mylibrary.libraryapplication.model.Book;
import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;

import java.util.Collection;

public interface BookRepository extends Repository<Book, Long> {

    Collection<Book> findByGenre(String genre) throws DataAccessException;

    Book findById(int id) throws DataAccessException;

    void save(Book book) throws DataAccessException;

    Collection<Book> findAll() throws DataAccessException;

    void delete(Book book) throws DataAccessException;
}
