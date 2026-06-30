package com.api.book.bootrestbook.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
        try{
            book = list.stream().filter(e-> e.getId()==id).findFirst().get();
        }catch(Exception exception){
            exception.printStackTrace();
        }
        return book; 
    }
    //Adding the book
    public Book addBook(Book b){
        list.add(b);
        return b;
    }
    public void deleteBook(int bid){
        list.stream().filter(book->{
            if(book.getId() != bid){
                return true;
            }else{
                return false;
            }
        }).collect( Collectors.toList());
    }
    public void updateBook(Book book, int bookId){
        list = list.stream().map(b->{
            if(b.getId() == bookId){
                b.setTitle(book.getTitle());
                b.setName(book.getName());
                b.setTitle(book.getAuthor());
            }
            return b;
        }).collect(Collectors.toList());
    }
}
