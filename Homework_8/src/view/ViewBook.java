package view;
import controller.Validator;
import model.Books;

import java.io.Serializable;

public class ViewBook implements Serializable {

    Validator validator = new Validator();


    public void print(Books books){
        if(books.getCount()==0){
            System.out.println( "No books!");
        }
        for(int i = 0; i < books.getCount(); i++){
            System.out.println(books.getBooks()[i].toString());
        }
    }
    public void print(String text){
        System.out.println(text);
    }
}
