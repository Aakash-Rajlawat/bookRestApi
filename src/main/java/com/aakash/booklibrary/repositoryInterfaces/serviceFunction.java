package com.aakash.booklibrary.repositoryInterfaces;

import com.aakash.booklibrary.entity.bookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

@Service
public class serviceFunction {


    private bookRepositoryInterface implementation;

    @Autowired
    public void setBookRepositoryInterface(bookRepositoryInterface bookRepositoryInterface) {
        this.implementation = bookRepositoryInterface;
    }

    ;

    //get all the books
    public List<bookEntity> getAllBooks() {
        return implementation.findAll();
    }

    ;

    //Upsert the book
    public bookEntity upsert(bookEntity book) {
        return implementation.save(book);
    }

    //Delete
    public String delete(Integer id) {
        implementation.deleteById(id);
        return "The record with id: " + id + " is deleted.";
    }

}
