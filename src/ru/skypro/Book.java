package ru.skypro;
//task1
public class Book {

    private String name;
    private Author author;
    private int publishYear;


    public static void Author(String[] args){
        Author author = new Author();

        //System.out.println( author.getAuthorName()+ " " +author.getAuthorSecondaryName() ); // Данный метод должен вывести цвет.
    }


    //task3
    public Book(String name, int publishYear, String author) {
        this.name = name;
        this.author = new Author();
        this.publishYear = publishYear;
    }

    public Book() {

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
