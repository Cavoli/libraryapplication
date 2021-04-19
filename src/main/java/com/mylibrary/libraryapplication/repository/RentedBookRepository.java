package com.mylibrary.libraryapplication.repository;

import com.mylibrary.libraryapplication.model.RentedBook;
import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;

import java.util.Collection;

public interface RentedBookRepository extends Repository<RentedBook, Integer> {

    Collection<RentedBook> findAll() throws DataAccessException;

    RentedBook findById(int id) throws DataAccessException;

    void save(RentedBook rentedBook) throws DataAccessException;

    void delete(RentedBook rentedBook) throws DataAccessException;
}
