package com.epam.homework6.model;

public class BookSource {

    private Book[] source = {
            new Book("To Kill a Mockingbird", "Harper Lee", "Arrow Books", 2012, 309, 238),
            new Book("1984", "George Orwell", "Caro", 2016, 384, 257),
            new Book("Harry Potter and the Philosopher’s Stone", "J.K. Rowling", "Bloomsbury ", 1997, 223, 145),
            new Book("Pride and Prejudice", "Jane Austen", "Harper Press", 2010, 320, 279),
            new Book("Jane Eyre", "Charlotte Bronte", "Caro", 2009, 512, 149),
            new Book("The Hobbit", "J.R.R. Tolkien", "HarperCollins Children's Books", 2011, 368, 438),
            new Book("The Lord of the Rings 2: The Two Towers", "J.R.R. Tolkien", "Harper Collins Books", 2012, 352, 1222),
            new Book("The Great Gatsby", "Francis Scott Fitzgerald", "Penguin", 2011, 192, 255),
            new Book("Don Quijote de la Mancha, 2", "Miguel de Cervantes Saavedra", "Grupo Anaya", 2012, 904, 1353),
            new Book("War and Peace", "Leo Tolstoy", "Random House, Inc.", 2004, 1424, 1004),
            new Book("One Hundred Years of Solitude", "Gabriel Garcia Marquez", "Penguin", 2014, 428, 367),
            new Book("Wuthering Heights", "Emily Bronte", "Macmillan Ltd", 1995, 96, 389),
            new Book("The Red and the Black", "Frederick Stendhal", "Oxford University Press", 2009, 560, 182),
            new Book("The Old Man and the Sea", "Ernest Hemingway", "Arrow Book", 2004, 100, 277),
            new Book("The Castle", "Franz Kafka", "Wordsworth Editions", 2009, 283, 124),
            new Book("Robinson Crusoe", "Daniel Defoe", "Collector's Library", 2010, 389, 304)
    };

    public BookSource() {
    }

    public Book[] getSourceBook() {
        return this.source;
    }

}

