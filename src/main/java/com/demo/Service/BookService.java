package com.demo.Service;

import com.demo.DAO.BookDAO;
import com.demo.Entity.Book;
import com.demo.Entity.BookUpdatePayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookDAO bookDAO;

    public Collection<Book> getBooks() {
        return bookDAO.getBooks();
    }

    public Book createBook(Book book) {
        return bookDAO.createBook(book);
    }

    public Optional<Book> getBookById(int id) {
        return bookDAO.getBookById(id);
    }

    public Optional<Book> deleteBookById(int id) {
        return bookDAO.deleteBookById(id);
    }

    public Optional<Book> updateBookById(int id, BookUpdatePayload bookUpdatePayload) {
        return bookDAO.updateBookById(id, bookUpdatePayload);
    }
}
