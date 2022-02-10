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

        //task1.10
        System.out.println(bookEng);
        System.out.println(bookRus);

        System.out.println(bookRus.hashCode());
        System.out.println(bookEng.hashCode());
        System.out.println(authorEng.hashCode());
        System.out.println(authorRus.hashCode());

        System.out.println(bookRus.equals(bookEng));
        System.out.println(bookRus.equals(bookRus));
        System.out.println(authorEng.equals(authorRus));
        System.out.println(authorEng.equals(authorEng));

    }
}
