package ru.job4j.pojo;

import java.util.Arrays;

public class Library {
    public static void main(String[] args) {
        Book bookOne = new Book("I will end with you", 123);
        Book bookTwo = new Book("It starts with us", 243);
        Book bookThree = new Book("The courage to be free", 534);
        Book bookFour = new Book("Daisy jones and the six", 224);
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
            if ("Clean Code".equals(books[i].getName())) {
                System.out.println(books[i].getName());
            }
        }
    }
}
