package com.epam;

public class Books {

    Book [] books;

    public Books(int length) {

        if(length <= 0){
            System.out.println("The length of array less or equal 0 ");
            return;
        }
        books=new Book[length];
        System.out.println("Number of books: "+ length);
    }

    public void add(Book book){

        for(int i = 0; i < books.length;i++){
            if(books[i] == null){
                books[i] = book;
                return;
             }
        }
        System.out.println("Array is full ");
    }

    public void displayBooks(){

        for (Book currentBook:books) {
            if (currentBook != null) {
                currentBook.view();
            }
      }
  }

     public void changeCost( double percent){
         percent /= 100;
         for(Book currentBook: books) {
             if(currentBook == null||currentBook.getCost() == 0){
                 break;
             }
            double oldCost = currentBook.getCost();
            double newCost = (oldCost + oldCost * percent);
             currentBook.setCost(newCost);
         }
     }

     public void searchBookByAuthor(String author){

         for(Book currentBook: books){
             if(currentBook == null||currentBook.getCost() == 0){
                 break;
             }
            if(currentBook.getAuthor().equals(author)){
                currentBook.view();
            }
        }
     }

    public void searchBookByYear(int year){

        for(Book currentBook: books){
            if(currentBook == null || currentBook.getCost() == 0){
                break;
            }
            if(currentBook.getYearOfPublish() > year){
                currentBook.view();
            }
        }
    }
}
