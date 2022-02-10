package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //task6

        Author authorEng = new Author("Joan","Rowling");
        Author authorRus = new Author("Leo","Tolstoy");

        Book bookEng = new Book("harry",2002,authorEng);
        Book bookRus = new Book("wap",1861,authorRus);
        System.out.println("bookEng: " + bookEng.getName() + "/"+ bookEng.getPublishYear()+"/"+ authorEng.getAuthorName()+" "+authorEng.getAuthorSecondaryName());

        //task7
        bookRus.setPublishYear(1866);
        System.out.println("bookRus.getPublishYear() = " + bookRus.getPublishYear());

    }
}
