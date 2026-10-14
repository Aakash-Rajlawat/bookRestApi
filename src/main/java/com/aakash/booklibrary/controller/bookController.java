package com.aakash.booklibrary.controller;

import com.aakash.booklibrary.entity.bookEntity;
import com.aakash.booklibrary.repositoryInterfaces.serviceFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class bookController {

    private serviceFunction serviceFunction;

    @Autowired
    public void setServiceFunction(serviceFunction serviceFunction) {
        this.serviceFunction = serviceFunction;
    }

    //Get all books
    @GetMapping(value = "/AllBooks" , produces = {"application/json" , "application/xml"})
    public List<bookEntity> getAllBooks() {
        return serviceFunction.getAllBooks();
    }

    ;

    //insert or update a book

    @PostMapping("/book")
    public String insertAndUpdate(@RequestBody bookEntity bookEntity) {
        serviceFunction.upsert(bookEntity);
        if (bookEntity.getBookId() == null) {
            return "INSERTED";
        } else {
            return "UPDATED";
        }
    }

    //Deleted a book

    @DeleteMapping("/deleteBook/{id}")
    public String DeleteById(@PathVariable Integer id) {
        serviceFunction.delete(id);
        return "Book With ID : " + id + " Is Deleted.";
    }
}
