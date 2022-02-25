package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //task6

        Author authorEng = new Author("Joan","Rowling");
        Author authorRus = new Author("Leo","Tolstoy");
        Book bookEng = new Book("harry_potter",2001,authorEng);
        Book bookRus = new Book("war and peace",1861,authorRus);

        System.out.println("authorEng = " + authorEng);
        System.out.println("bookEng = " + bookEng);

        System.out.println("bookEng: " + bookEng.getName() + "/"+ bookEng.getPublishYear()+"/"+ authorEng.getAuthorName()+" "+authorEng.getAuthorSecondaryName());

        //task7
        bookRus.setPublishYear(1866);
        System.out.println("bookRus.getPublishYear() = " + bookRus.getPublishYear());

        //task1.10
        System.out.println(bookEng);
        System.out.println(bookRus);
        System.out.println(bookEng.equals(bookRus));
        System.out.println(bookEng.equals(bookEng));
        System.out.println(authorEng.equals(authorRus));
        System.out.println(authorEng.equals(authorEng));
        System.out.println(bookRus.hashCode());
        System.out.println(bookEng.hashCode());
        System.out.println(authorEng.hashCode());
        System.out.println(authorRus.hashCode());


    }

}
