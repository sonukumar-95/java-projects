package com.api.book.bootrestbook.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.api.book.bootrestbook.entities.Book;

@Component
public class BookService {
    private static List<Book> list = new ArrayList<>();
    static{
        list.add(new Book(02,"C++","Rhema Theraja","abc"));
        list.add(new Book(03,"DSA","Theraja","efg"));
        list.add(new Book(04,"DBMS","Rhema ","xyz"));
    }
    //get all books
    public List<Book> getAllBooks(){
        return list;
    }
    //get single book
    public Book getBookById(int id){
        Book book = null;
        book = list.stream().filter(e-> e.getId()==id).findFirst().get();
        return book; 
    }
}
