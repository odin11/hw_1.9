package ru.skypro;

import java.util.Objects;

//task1
public class Book {

    private String name;
    //private String author;
    private Author author;
    private int publishYear;

    //task3
    public Book(String name, int publishYear, Author author) {
        this.name = name;
        this.author = new Author();
        //this.author = author.toString();
        this.publishYear = publishYear;
    }


    //task4
    public String getName() {
        return this.name;
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    //task5
    public void setPublishYear(int  publishYear) {
        this.publishYear = publishYear;
    }

    //task1.10
    /*public String toString() {
        return "Name: " + this.name + " PublishYear: " + this.publishYear + " Author: " + this.author;
    }*/

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                //", author=" + author.toString() +
                ", author=" + author.toString() +
                ", publishYear=" + publishYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishYear == book.publishYear && name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publishYear);
    }
}
