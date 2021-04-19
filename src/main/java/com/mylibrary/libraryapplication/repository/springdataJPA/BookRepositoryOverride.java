package com.mylibrary.libraryapplication.repository.springdataJPA;

import com.mylibrary.libraryapplication.model.Book;

public interface BookRepositoryOverride {

    void delete(Book book);
}
