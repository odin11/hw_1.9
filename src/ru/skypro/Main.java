package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //task6

        Author authorEng = new Author("Joan","Rowling");
        Author authorRus = new Author("Leo","Tolstoy");
        Book bookEng = new Book("harry_potter",2001,"Joan Rowling");
        Book bookRus = new Book("war and peace",1861,"Leo Tolstoy");

        System.out.println("bookEng: " + bookEng.getName() + "/"+ bookEng.getPublishYear()+"/"+ authorEng.getAuthorName()+" "+authorEng.getAuthorSecondaryName());

        //task7
        bookRus.setPublishYear(1866);
        System.out.println("bookRus.getPublishYear() = " + bookRus.getPublishYear());

    }
}
