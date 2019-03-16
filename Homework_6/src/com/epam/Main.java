package com.epam;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of books: ");
        int lengthOfBooks = scanner.nextInt();
        Books books = new Books(lengthOfBooks);

        Book book = new Book(1,"Clean Code", "Martin", "Piter", 2010, 465, 1000);
        Book book1 = new Book(2,"Java 8", "Shildt", "Williams", 2015, 1377, 2000);
        Book book2 = new Book(3,"Head First Java", "Kathy Sierra & Bert Bates", "O'Reilly", 2003, 690, 1600);

        books.add(book);
        books.add(book1);
        books.add(book2);

        books.displayBooks();

        System.out.println("Enter the percent: ");
        double percent = scanner.nextDouble();
        books.changeCost(percent);

        System.out.println("Enter name of author: ");
        String author = scanner.next();
        books.searchBookByAuthor(author);

        System.out.println("Enter the year of publishing: : ");
        int year = scanner.nextInt();
        books.searchBookByYear(year);
    }
}
