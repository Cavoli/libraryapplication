package com.mylibrary.libraryapplication.repository;

import com.mylibrary.libraryapplication.model.Owner;
import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;

import java.util.Collection;

public interface OwnerRepository extends Repository<Owner, Integer> {

    Collection<Owner> findByLastName(String lastName) throws DataAccessException;

    Owner findById(int id) throws DataAccessException;

    void save(Owner owner) throws DataAccessException;

    Collection<Owner> findAll() throws DataAccessException;

    void delete(Owner owner) throws DataAccessException;
}
