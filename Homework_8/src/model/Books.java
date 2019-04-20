package model;

import controller.Validator;

import java.util.Arrays;
import java.util.Comparator;

public class Books {

    private Book [] books;
    private int count=0;

    Validator validator = new Validator();

    public Books(int length) {
        try {
            validator.verifyArrayLength(length);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        books=new Book[length];
    }

    public Book[] getBooks() {
        return books;
    }

    public int getCount() {
        return count;
    }

    public boolean add(Book book){
        if(count >= books.length)
        {
            return false;
        }
        books[count++] = book;
        return true;

    }
    public void changeCost( double percent){
        for(int i = 0;i < count; i++){
            books[i].changePrice(percent);
        }
    }

    public Books searchBookByAuthor(String author){
        try{
            validator.verifyStringInput(author);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        Books newBook = new Books(count);
        for(int i = 0; i < count; i++){
            if(books[i].getAuthor().equalsIgnoreCase(author)){
                newBook.add(books[i]);
            }
        }
        return newBook;
    }

    public Books searchBookByYear(int year) {
        try {
            validator.verifyYear(year);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        Books newBook = new Books(count);
        for (int i = 0; i < count; i++) {
            if (books[i].getYearOfPublish() > year) {
                newBook.add(books[i]);
            }
        }
        return newBook;
    }

    public Book [] sortByAuthor(){
        Book[] newBooks = Arrays.copyOf(books, count);
        Arrays.sort(newBooks, new Comparator<Book>(){
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
    });

        return newBooks;
    }

    public Book [] sortByPublishingOffice(){
        Book[] newBooks = Arrays.copyOf(books, count);
        Arrays.sort(newBooks, new Comparator<Book>(){
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPublishingOffice().compareTo(o2.getPublishingOffice());
            }
        });

        return newBooks;
    }

    public Book [] sortByCost(){
        Book[] newBooks = Arrays.copyOf(books, count);
        Arrays.sort(newBooks, new Comparator<Book>(){
            @Override
            public int compare(Book o1, Book o2) {
                return (int)(o1.getCost() - o2.getCost());
            }
        });

        return newBooks;
    }

}
