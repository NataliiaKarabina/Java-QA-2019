package com.epam.homework8.model;

import java.util.ArrayList;

public class BookSource {
    private ArrayList<Book> source = new ArrayList<>();

    public BookSource() {
        source.add(new Book("To Kill a Mockingbird", "Harper Lee", "Arrow Books", 2012, 309, 238));
        source.add(new Book("1984", "George Orwell", "Caro", 2016, 384, 257));
        source.add(new Book("Harry Potter and the Philosopher’s Stone", "J.K. Rowling", "Bloomsbury ", 1997, 223, 145));
        source.add(new Book("Pride and Prejudice", "Jane Austen", "Harper Press", 2010, 320, 279));
        source.add(new Book("Jane Eyre", "Charlotte Bronte", "Caro", 2009, 512, 149));
        source.add(new Book("The Hobbit", "J.R.R. Tolkien", "HarperCollins Children's Books", 2011, 368, 438));
        source.add(new Book("The Lord of the Rings 2: The Two Towers", "J.R.R. Tolkien", "Harper Collins Books", 2012, 352, 1222));
        source.add(new Book("The Great Gatsby", "Francis Scott Fitzgerald", "Penguin", 2011, 192, 255));
        source.add(new Book("Don Quijote de la Mancha, 2", "Miguel de Cervantes Saavedra", "Grupo Anaya", 2012, 904, 1353));
        source.add(new Book("War and Peace", "Leo Tolstoy", "Random House, Inc.", 2004, 1424, 1004));
        source.add(new Book("One Hundred Years of Solitude", "Gabriel Garcia Marquez", "Penguin", 2014, 428, 367));
        source.add(new Book("Wuthering Heights", "Emily Bronte", "Macmillan Ltd", 1995, 96, 389));
        source.add(new Book("The Red and the Black", "Frederick Stendhal", "Oxford University Press", 2009, 560, 182));
        source.add(new Book("The Old Man and the Sea", "Ernest Hemingway", "Arrow Book", 2004, 100, 277));
        source.add(new Book("The Castle", "Franz Kafka", "Wordsworth Editions", 2009, 283, 124));
        source.add(new Book("Robinson Crusoe", "Daniel Defoe", "Collector's Library", 2010, 389, 304));
    }

    public ArrayList<Book> getSourceBook() {
        return source;
    }
}
