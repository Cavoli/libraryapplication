package com.mylibrary.libraryapplication.repository.springdataJPA;

import com.mylibrary.libraryapplication.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BookRepositoryImpl implements BookRepositoryOverride {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void delete(Book book) {
        String bookId = book.getId().toString();
        this.em.createQuery("DELETE FROM RentedBook rentedBook WHERE book_id=" + bookId).executeUpdate();
        this.em.createQuery("DELETE FROM Book book WHERE id=" + bookId).executeUpdate();
        if (em.contains(book)) {
            em.remove(book);
        }
    }
}
