package com.isfirs;

import com.isfirs.bookstore.model.Author;
import com.isfirs.bookstore.model.Book;

public class Main {

    public static void main(String[] args) {
        Author isfirs = new Author("Isfirs");

        Book book = new Book("HowTo Java 9 Modules", isfirs);

        System.out.println(book.toString());
    }

}
