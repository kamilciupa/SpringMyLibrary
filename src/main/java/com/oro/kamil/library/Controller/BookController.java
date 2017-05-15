package com.oro.kamil.library.Controller;

import com.oro.kamil.library.Entity.Book;
import com.oro.kamil.library.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Kamil on 2017-04-30.
 */

@RestController
public class BookController {

    @Autowired
    private BookService service;

    @RequestMapping("/books")
    public List<Book> getAllBooks(){
        return service.getAllBooks();
    }

    @RequestMapping("/books/{id}")
    public Book getBookById(@PathVariable Integer id) {
        return service.getBookById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/books")
    public void addBook(@RequestBody Book book) {
        service.addBook(book);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/books/{id}")
    public void deleteBook(@PathVariable Integer id) {
        service.deleteBook(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/books/{id}")
    public void updateUser(@RequestBody Book book, @PathVariable Integer id){
        service.updateUser(book, id);
    }




}
