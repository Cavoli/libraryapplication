package com.mylibrary.libraryapplication.repository.springdataJPA;

import com.mylibrary.libraryapplication.repository.BookRepository;
import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpringDataBookRepository extends BookRepository, BookRepositoryOverride{


}
