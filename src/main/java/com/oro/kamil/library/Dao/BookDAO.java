package com.oro.kamil.library.Dao;

import com.oro.kamil.library.Entity.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kamil on 2017-05-04.
 */
public interface BookDAO extends CrudRepository<Book, Integer> {
}
