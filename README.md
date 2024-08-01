# Enhanced-Library

package com.company;
class Library{
    String[] books;
    String[] name;
    int noOfBooks;
    Library(){
        this.noOfBooks=0;
        this.books = new String[1000];
        this.name = new String[100];
    }
    public void addBooks(String newBook , String name){
        books[noOfBooks] = newBook;
        noOfBooks++;
        System.out.println(newBook + " has been added by " + name);
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

    public void issueBooks(String bookName, String name){
        System.out.println("\nIssued Books~");
        for (int i=0; i<this.books.length; i++){
            if (this.books[i].matches(bookName)){
                this.books[i]= null;
                System.out.println("*" + bookName + " has been issued by " + name);
                return;
            }
        }
    }
}

public class Library_104 {
    public static void main(String[] args) {

        Library library = new Library();
        library.addBooks("Sapiens","Alok");
        library.addBooks("I fell in love with hope","Anchal");
        library.addBooks("Hidden hindu","Jordan");
        library.addBooks("40 rules of Love","Alok");
        library.addBooks("Death - by Sadhguru","Alok");

        library.showAvailableBooks();

        library.issueBooks("40 rules of Love","Anchal");
        library.issueBooks("Sapiens","Anchal");

//        library.showAvailableBooks();


    }
}
