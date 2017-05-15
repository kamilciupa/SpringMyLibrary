package com.oro.kamil.library.Entity;

/**
 * Created by Kamil on 2017-04-30.
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Book {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String author;
    private Boolean isRented;

    protected Book() {}

    public Book(String title, String author, int amount){
        super();
        this.title = title;
        this.author = author;
        this.isRented = false;
    }

    @Override
  public String toString(){
        return String.format(
                "Book [ id=%d, Title= '%s', Author = '$s' ]",
                id, title, author);
  }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getRented() {    return isRented;    }

    public void setRented(Boolean rented) { isRented = rented;    }
}
