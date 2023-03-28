package ru.job4j.pojo;

import java.util.Arrays;

public class Library {
    public static void main(String[] args) {
        Book bookOne = new Book();
        Book bookTwo = new Book();
        Book bookThree = new Book();
        Book bookFour = new Book();
        Book[] books = new Book[4];
        books[0] = bookOne;
        books[1] = bookTwo;
        books[2] = bookThree;
        books[3] = bookFour;
        bookOne.setName("Clean Code");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName());
        }
        Book tempBook = books[0];
        books[0] = books[3];
        books[3] = tempBook;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName());
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName() == "Clean Code") {
                System.out.println(books[i].getName());
            }
        }
    }
}
