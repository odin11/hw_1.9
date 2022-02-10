package ru.skypro;
//task1
public class Book {

    private String name;
    private Author author;
    private int publishYear;

    //task3
    public Book(String name, int publishYear, Author author) {
        this.name = name;
        this.author = new Author();
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
}
