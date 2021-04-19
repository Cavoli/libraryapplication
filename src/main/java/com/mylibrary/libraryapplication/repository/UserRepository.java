package com.mylibrary.libraryapplication.repository;

import com.mylibrary.libraryapplication.model.User;
import org.springframework.dao.DataAccessException;

public interface UserRepository {

    void save(User user) throws DataAccessException;
}
