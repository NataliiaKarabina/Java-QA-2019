package com.epam.homework8.controller;

import com.epam.homework8.model.Book;
import com.epam.homework8.model.BookSource;
import com.epam.homework8.model.Books;
import com.epam.homework8.service.Validator;
import com.epam.homework8.view.ViewBooks;

import java.util.Arrays;

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

        boolean success = false;
        Validator validator = new Validator();
        while (!success) {
            viewBooks.print("\nEnter percent -> ");
            String percent = InputUtil.inputString();
            try {
                validator.validatePercent(percent);
                books.changeCost(Double.parseDouble(percent));
                viewBooks.print(books.viewBooks());
                success = true;
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }

        success = false;
        while (!success) {
            viewBooks.print("\nEnter author -> ");
            String author = InputUtil.inputString();
            try {
                validator.validateAuthorName(author);
                Books nBooks = books.searchByAuthor(author);
                viewBooks.print(nBooks.viewBooks());
                success = true;
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }

        success = false;
        while (!success) {
            viewBooks.print("Enter year -> ");
            String year = InputUtil.inputString();
            try {
                validator.validateYear(year);
                Books books2 = books.searchByYear(Integer.parseInt(year));
                viewBooks.print(books2.viewBooks());
                success = true;
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }


        System.out.println("-----------------Sort by author---------------------");
        String aBooks = books.sortByAuthor();
        viewBooks.print(aBooks);

        System.out.println("---------------Sort by publisher--------------------");
        String pBooks = books.sortByPublisher();
        viewBooks.print(pBooks);

        System.out.println("-----------------Sort by cost-----------------------");
        String cBooks = books.sortByCost();
        viewBooks.print(cBooks);


    }

}
