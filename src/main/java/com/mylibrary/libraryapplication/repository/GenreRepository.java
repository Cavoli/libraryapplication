package com.mylibrary.libraryapplication.repository;

import com.mylibrary.libraryapplication.model.Genre;
import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;

import java.util.Collection;

public interface GenreRepository extends Repository<Genre, Integer> {

    Genre findById(int id) throws DataAccessException;

    Collection<Genre> findAll() throws DataAccessException;

    void save(Genre genre) throws DataAccessException;

    void delete(Genre genre) throws DataAccessException;
}
