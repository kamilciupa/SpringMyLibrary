package com.oro.kamil.library.Service;

import com.oro.kamil.library.Dao.BookDAO;
import com.oro.kamil.library.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kamil on 2017-05-04.
 */
@Service
public class BookService {

    @Autowired
    private BookDAO bookDAO;


    public List<Book> getAllBooks() {

        List<Book> books = new ArrayList<>();
        bookDAO.findAll().forEach(books::add);
        return books;
    }

    public Book getBookById(Integer id) {
        return bookDAO.findOne(id);
    }

    public void deleteBook(Integer id) {
        bookDAO.delete(id);
    }

    public void addBook(Book book) {
        bookDAO.save(book);
    }

    public void updateUser(Book book, Integer id) {
        bookDAO.save(book);
    }
}
