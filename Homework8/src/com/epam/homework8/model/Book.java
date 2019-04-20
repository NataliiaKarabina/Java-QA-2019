package com.epam.homework8.model;

public class Book {
        private static int nextID = 1;
        private int ID;
        private String title;
        private String author;
        private String publishingHouse;
        private int yearOfPublishing;
        private int numberOfPages;
        private double cost;

        public Book() {
            this.ID = nextID++;
        }

        public Book(String title, String author, String publishingHouse, int yearOfPublishing, int numberOfPages, double cost) {
            this();
            this.title = title;
            this.author = author;
            this.publishingHouse = publishingHouse;
            this.yearOfPublishing = yearOfPublishing;
            this.numberOfPages = numberOfPages;
            this.cost = cost;
        }

        public int getID() {
            return ID;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getPublishingHouse() {
            return publishingHouse;
        }

        public void setPublishingHouse(String publishingHouse) {
            this.publishingHouse = publishingHouse;
        }

        public int getYearOfPublishing() {
            return yearOfPublishing;
        }

        public void setYearOfPublishing(int yearOfPublishing) {
            this.yearOfPublishing = yearOfPublishing;
        }

        public int getNumberOfPages() {
            return numberOfPages;
        }

        public void setNumberOfPages(int numberOfPages) {
            this.numberOfPages = numberOfPages;
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }


        public String toString() {
            return "ID = " + this.getID() + "; title = " + this.getTitle() + "; author = " + this.getAuthor() + "; Publishing house = " +
                    this.getPublishingHouse() + "; Year of publishing = " + this.getYearOfPublishing() + ";  Number of pages = " + this.getNumberOfPages() +
                    "; Cost = " + this.getCost();
        }

        public void changeCost(double percent) {
            this.cost = Math.round(cost + cost * percent / 100);
        }
}
