package com.epam.homework6.controller;

import com.epam.homework6.model.Book;
import com.epam.homework6.model.BookSource;
import com.epam.homework6.model.Books;
import com.epam.homework6.view.ViewBooks;

public class ControllerBooks {
    private Books books;
    private ViewBooks viewBooks = new ViewBooks();
    private BookSource source;

    public void run() {
        viewBooks.print("Enter size -> ");
        books = new Books(InputUtil.inputInt());
        source = new BookSource();
        for (Book elem : source.getSourceBook()) {
            books.addBook(elem);
        }
        viewBooks.print(books.viewBooks());

        viewBooks.print("\nEnter percent -> ");
        books.changeCost(InputUtil.inputInt());
        viewBooks.print(books.viewBooks());

        viewBooks.print("\nEnter author -> ");
        String author = InputUtil.inputString();
        Books nBooks = books.searchByAuthor(author);
        viewBooks.print(nBooks.viewBooks());

        viewBooks.print("Enter year -> ");
        Books books2 = books.searchByYear(InputUtil.inputInt());
        viewBooks.print(books2.viewBooks());
    }

}
