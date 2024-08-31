package com.jordanjava;

//#Enhanced-Library

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

class LibraryEnh {
    String[] books;
    String[] name;
    int noOfBooks;
    LocalDateTime ldt = LocalDateTime.now();

    LibraryEnh(){
        this.noOfBooks=0;
        this.books = new String[1000];
        this.name = new String[100];
    }
    public void addBooks(String newBook , String name, LocalDateTime ldt){
        books[noOfBooks] = newBook;
        noOfBooks++;
        System.out.println(newBook + " has been added by " + name +" on " + ldt.getYear() + ":" + ldt.getMonth() +  ":" + ldt.getDayOfMonth() );
    }

    public void showAvailableBooks(){
        System.out.println("\nAvailable books are~");
        for (String e : this.books){
            if (e == null){
                continue;
            }
            System.out.println("*" + e);
        }
    }

    public void issueBooks(String bookName, String name, LocalDateTime ldt){
        System.out.println("\nIssued Books~");
        for (int i=0; i<this.books.length; i++){
            if (this.books[i].matches(bookName)){
                this.books[i]= null;
                System.out.println("*" + bookName + " has been issued by " + name + " on "+ ldt.getYear() + ":" + ldt.getMonth() +  ":" + ldt.getDayOfMonth() );
                return;
            }
        }
    }
    public void returnBook(String bookName, String name, LocalDateTime ldt){
        System.out.print("Book Return update : " );
                 addBooks(bookName, name, ldt);

    }
}

public class Enhanced_Library {
    public static void main(String[] args) {

        LibraryEnh library = new LibraryEnh();
        library.addBooks("Sapiens","Alok", LocalDateTime.now());
        library.addBooks("Hidden hindu","Jordan", LocalDateTime.now());
        library.addBooks("40 rules of Love","Neeraj", LocalDateTime.now());
        library.addBooks("Death - by Sadhguru","Pushpa", LocalDateTime.now());

        library.showAvailableBooks();

        library.issueBooks("Sapiens", "Arjun", LocalDateTime.now());

        library.showAvailableBooks();

        library.returnBook("Sapiens", "Arjun", LocalDateTime.now());


    }
}
