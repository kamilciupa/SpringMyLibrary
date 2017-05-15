package com.oro.kamil.library.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kamil on 2017-05-01.
 */

@Entity
public class LibUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String surname;
    private String nickname;
    private String email;
    @ElementCollection
    @CollectionTable(name="listOfRentedBooks")
    private List<Book> books;

    public LibUser(){}

    public LibUser(String name, String surname, String nickname, String email) {
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
        this.email = email;
        this.books = new ArrayList<Book>();
    }


    public void rentBook(Book book){
        if(!book.getRented())
            books.add(book);
    }

    public void returnBook(long bookId){
        for(Book b : books){
            if(b.getId() == bookId)
                books.remove(b);
        }
    }

    public String toString(){
        return String.format(
                "Library User [ id = %d, Nickname = %s, Name = %s, Surname = %s, Email = %s ",
                id,nickname,name,surname,email
        );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
