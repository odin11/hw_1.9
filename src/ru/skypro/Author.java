package ru.skypro;

import java.util.Objects;

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

    //public Author() {
    //}

    //task4
    public String getAuthorName() {
        return this.authorName;

    }

    public String getAuthorSecondaryName() {
        return this.authorSecondaryName;

    }

    //task1.10
   @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorSecondaryName='" + authorSecondaryName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorName.equals(author.authorName) && authorSecondaryName.equals(author.authorSecondaryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSecondaryName);
    }
}
