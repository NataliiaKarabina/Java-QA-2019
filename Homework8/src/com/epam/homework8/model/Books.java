package com.epam.homework8.model;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;

public class Books {
    private int count = 0;
    private Book[] library;

    public Books(int size) {
        this.library = new Book[size];
    }

    public boolean addBook(Book b) {
        if (count >= library.length) {
            return false;
        }
        library[count++] = b;
        return true;

    }

    public String viewBooks() {
        if (count == 0) {
            return "No result";
        }
        String books = "";
        for (int i = 0; i < count; i++) {
            books += library[i].toString();
            books += "\n";
        }
        return books;
    }

    public void changeCost(double percent) {
        for (int i = 0; i < count; i++) {
            library[i].changeCost(percent);
        }
    }

    public Books searchByAuthor(String author) {
        Books newBooks = new Books(count);
        for (int i = 0; i < count; i++) {
            if (author.equalsIgnoreCase(library[i].getAuthor())) {
                newBooks.addBook(library[i]);
            }
        }
        return newBooks;
    }

    public Books searchByYear(int year) {
        Books newBooks = new Books(count);
        for (int i = 0; i < count; i++) {
            if (library[i].getYearOfPublishing() > year) {
                newBooks.addBook(library[i]);
            }
        }
        return newBooks;
    }


    public String sortByAuthor() {
        Book[] b = Arrays.copyOf(library, count);
        Arrays.sort(b, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });
        return Arrays.toString(b);
    }

    public String sortByPublisher() {
        Book[] b = Arrays.copyOf(library, count);
        Arrays.sort(b, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPublishingHouse().compareTo(o2.getPublishingHouse());
            }
        });
        return Arrays.toString(b);
    }

    public String sortByCost() {
        Book[] b = Arrays.copyOf(library, count);
        Arrays.sort(b, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int) (((Book) o2).getCost() - ((Book) o1).getCost());
            }
        });
        return Arrays.toString(b);
    }

}
