package com.api.book.bootrestbook.entities;

public class Book {
    private int id;
    private String name;
    private String title;
    private String author;

    public Book(int id, String name, String title, String author) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.author = author;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", title=" + title + ", author=" + author + "]";
    }
}
