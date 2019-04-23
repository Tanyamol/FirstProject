package model;

import java.io.Serializable;

public class Book implements Serializable {

    private static int nextID=1;
    private int id;
    private String name;
    private String author;
    private String publishingOffice;
    private int yearOfPublish;
    private int quantityOfPages;
    private double price;

    public Book(){

        this.id=nextID++;
    }

    public int getId() {
        return id;
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
        return price;
    }

    public void setCost(double cost) {
        this.price = price;
    }

    public Book( String name, String author, String publishingOffice, int yearOfPublish, int quantityOfPages, int costOfBook) {

        this();
        this.name=name;
        this.author = author;
        this.publishingOffice = publishingOffice;
        this.yearOfPublish = yearOfPublish;
        this.quantityOfPages = quantityOfPages;
        this.price = costOfBook;
    }



    public void changePrice(double percent){
        this.price= price+price*percent/100;
    }

    public String  toString(){

        return "id: " + this.getId() + " name: " + this.getName() + " author: " + this.getAuthor() + " publishingOffice: " + this.getPublishingOffice() +
                " yearOfPublish: " + this.getYearOfPublish() + " quantityOfPages: " + this.getQuantityOfPages() + " cost: " + this.getCost();
    }

}
