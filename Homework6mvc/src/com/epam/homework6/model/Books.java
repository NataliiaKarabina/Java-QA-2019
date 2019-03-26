package com.epam.homework6.model;

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
            books += library[i].view();
            books += "\n";
        }
        return books;
    }

    public void changeCost(int percent) {
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
}

