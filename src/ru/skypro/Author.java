package ru.skypro;
//task2
public class Author {
    private String authorName;
    private String authorSecondaryName;

//task3
    public Author(String authorName, String authorSecondaryName) {
        this.authorName = authorName;
        this.authorSecondaryName = authorSecondaryName;
    }

    public Author() {

    }

    //task4
    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorSecondaryName() {
        return this.authorSecondaryName;
    }
}
