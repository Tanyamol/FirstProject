package model;
import java.io.*;


public class ObjectStream {

    public void workWithFile(Books books) {

        try (ObjectOutputStream outPut = new ObjectOutputStream(
                new FileOutputStream("books.ser"));
             ObjectInputStream inPut = new ObjectInputStream( new FileInputStream("books.ser")) ) {

            outPut.writeObject(books);

            Books newBook = (Books) inPut.readObject();
            System.out.println(newBook.toString());

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException | ClassNotFoundException e ) {
            e.printStackTrace();
        }

    }

}




