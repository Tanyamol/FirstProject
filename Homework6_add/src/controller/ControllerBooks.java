package controller;

import model.Book;
import model.Books;
import view.ViewBook;

public class ControllerBooks {
    private Books books;
    private ViewBook viewBooks=new ViewBook();
    private void init(){
        viewBooks.print("Enter size->");
        books=new Books(InputUtil.inputInt());

        Book book = new Book("Clean Code", "Martin", "Piter", 2010, 465, 1000);
        Book book1 = new Book("Java 8", "Shildt", "Williams", 2015, 1377, 2000);
        Book book2 = new Book("Head First Java", "Kathy Sierra & Bert Bates", "O'Reilly", 2003, 690, 1600);

        books.add(book);
        books.add(book1);
        books.add(book2);
    }
    public void run(){
        init();
        viewBooks.print(books);

        viewBooks.print("\nEnter percent->");
        books.changeCost(InputUtil.inputInt());
        viewBooks.print(books);

        viewBooks.print("\nEnter author->");
        Books booksByAuthor=books.searchBookByAuthor(InputUtil.inputString());
        viewBooks.print(booksByAuthor);

        viewBooks.print("\nEnter year->");
        Books booksByYear=books.searchBookByYear(InputUtil.inputInt());
        viewBooks.print(booksByYear);


    }
}
