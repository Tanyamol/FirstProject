package com.epam;

public class Book {

    private int id;
    private String name;
    private String author;
    private String publishingOffice;
    private int yearOfPublish;
    private int quantityOfPages;
    private double cost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingOffice() {
        return publishingOffice;
    }

    public void setPublishingOffice(String publishingOffice) {
        this.publishingOffice = publishingOffice;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public int getQuantityOfPages() {
        return quantityOfPages;
    }

    public void setQuantityOfPages(int quantityOfPages) {
        this.quantityOfPages = quantityOfPages;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Book(int id, String name, String author, String publishingOffice, int yearOfPublish, int quantityOfPages, int costOfBook) {

        this.id = id;
        this.name=name;
        this.author = author;
        this.publishingOffice = publishingOffice;
        this.yearOfPublish = yearOfPublish;
        this.quantityOfPages = quantityOfPages;
        this.cost = costOfBook;
    }

    public void view(){

        System.out.println("id: " + id + " name: " + name + " author: " + author + " publishingOffice: " + publishingOffice +
                " yearOfPublish: " + yearOfPublish + " quantityOfPages: " +  " cost: " + cost);
    }
}
