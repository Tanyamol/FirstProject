package view;

import model.Book;
import model.Books;

public class ViewBook {

    public void  print(Book book){

        System.out.println( "id: " + book.getId() + " name: " + book.getName() + " author: " + book.getAuthor() + " publishingOffice: " + book.getPublishingOffice() +
                " yearOfPublish: " + book.getYearOfPublish() + " quantityOfPages: " +  " cost: " + book.getCost());
    }

    public void print(Books books){
        if(books.getCount()==0){
            System.out.println( "No books!");
        }
        for(int i=0; i<books.getCount(); i++){
            print(books.getBooks()[i]);
        }
    }
    public void print(String text){
        System.out.println(text);
    }
}
