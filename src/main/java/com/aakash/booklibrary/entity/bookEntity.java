package com.aakash.booklibrary.entity;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Entity
@Table(name = "Book_Details")
@Data
@XmlRootElement
public class bookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_Id")
    private Integer bookId;

    @Column(name = "book_Name")
    private String bookName;

    @Column(name = "number_Of_Pages")
    private Integer numberOfPages;

    @Column(name = "price_Of_Book")
    private Double priceOfBook;

    @Column(name = "book_Author")
    private String bookAuthor;

}
