package com.epam.homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size = 7;
        Books books = new Books(size);
        //ID, String title, String author, String publishingHouse,
        // String yearOfPublishing, int numberOfPages, double cost
        Book[] source = {
                new Book(1, "To Kill a Mockingbird", "Harper Lee", "Arrow Books", 2012, 309, 238),
                new Book(2, "1984", "George Orwell", "Caro", 2016, 384, 257),
                new Book(3, "Harry Potter and the Philosopher’s Stone", "J.K. Rowling", "Bloomsbury ", 1997, 223, 145),
                new Book(4, "Pride and Prejudice", "Jane Austen", "Harper Press", 2010, 320, 279),
                new Book(5, "Jane Eyre", "Charlotte Bronte", "Caro", 2009, 512, 149),
                new Book(6, "The Hobbit", "J.R.R. Tolkien", "HarperCollins Children's Books", 2011, 368, 438),
                new Book(7, "The Lord of the Rings 2: The Two Towers", "J.R.R. Tolkien", "Harper Collins Books", 2012, 352, 1222)
        };
        for (Book elem : source) {
            books.addBook(elem);
        }

        books.printBooks();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter percent of cost change -> ");
        int percent = Integer.parseInt(sc.nextLine());

        books.changeCost(percent);
        books.printBooks();

        System.out.println("Enter author to search -> ");
        String author = sc.nextLine();
        Books booksAuthor = books.searchByAuthor(author);
        booksAuthor.printBooks();


        System.out.println("Enter year to search -> ");
        int year = Integer.parseInt(sc.nextLine());
        Books booksYear = books.searchByYear(year);
        booksYear.printBooks();

    }
}
