package com.mylibrary.libraryapplication.repository;

import com.mylibrary.libraryapplication.model.Customer;
import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;

import java.util.Collection;

public interface CustomerRepository extends Repository<Customer, Integer> {

    Collection<Customer> findByLastName(String lastName) throws DataAccessException;

    Customer findById(int id) throws DataAccessException;

    void save(Customer customer) throws DataAccessException;

    Collection<Customer> findAll() throws DataAccessException;

    void delete(Customer customer) throws DataAccessException;
}
