package com.epam.homework6;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Arrays;

public class Books {
    Book[] books = {
    };

    public Books(int size) {
        Book[] books = new Book[size];
    }

    public void addBook(Book b) {
        books = Arrays.copyOf(books, books.length + 1);
        books[books.length - 1] = b;
    }

    public void printBooks() {
        if (books.length == 0) {
            System.out.println("No result");
        }
        for (Book elem : books) {
            elem.view();
        }
    }

    public void changeCost(int percent) {
        double cost;
        for (Book elem : books) {
            cost = elem.getCost();
            cost = cost + cost * percent / 100.0;
            elem.setCost(cost);
        }
    }

    public Books searchByAuthor(String author) {
        Books newBooks = new Books(0);
        for (Book elem : books) {

            if (author.equals(elem.getAuthor())) {
                newBooks.addBook(elem);

            }
        }
        return newBooks;
    }

    public Books searchByYear(int year) {
        Books newBooks = new Books(0);
        for (Book elem : books) {

            if (elem.getYearOfPublishing() > year) {
                newBooks.addBook(elem);

            }
        }
        return newBooks;
    }
}

