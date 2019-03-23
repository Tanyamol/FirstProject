package model;

public class Books {

    private Book [] books;
    private int count=0;

    public Books(int length) {
        if(length <= 0){
            System.out.println("The length of array less or equal 0 ");
            return;
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
        if(count>=books.length)
        {
            return false;
        }
        books[count++]=book;
        return true;

    }
    public void changeCost( double percent){
       for(int i=0;i<count;i++){
           books[i].changePrice(percent);
        }
    }

    public Books searchBookByAuthor(String author){
         Books newBook=new Books(count);
        for(int i=0; i<count; i++){
            if(books[i].getAuthor().equalsIgnoreCase(author)){
                newBook.add(books[i]);
            }
        }
        return newBook;
    }

    public Books searchBookByYear(int year){
        Books newBook=new Books(count);
        for(int i=0; i<count; i++){
            if(books[i].getYearOfPublish() > year){
                newBook.add(books[i]);
        }
    }
        return newBook;
    }
}
