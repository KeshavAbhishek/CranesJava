
/**
 * ==========================================================
 * Program Name: Main1
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 21-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

import java.util.ArrayList;

class Book {
    String title;
    String author;
    String ISBN;
    boolean isAvailable;

    public Book() {
        super();
    }

    public Book(String title, String author, String iSBN, boolean isAvailable) {
        this.title = title;
        this.author = author;
        ISBN = iSBN;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Book{Title= " + title + ", " + "Author= " + author + ", " + "ISBN= " + ISBN + ", " + "Available = "
                + isAvailable + "}";
    }
}

class Library {
    ArrayList<Book> books;

    Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book b) {
        books.add(b);
        System.out.println("Book added: " + b.getTitle());
    }

    public void displayBook() {
        System.out.println("\n\nBooks available...");
        for (Book book : books) {
            if (book.isAvailable) {
                System.out.println(book);
            }
        }
    }

    public void searchBook(String name) {
        boolean flag = false;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(name)) {
                System.out.println(book);
                flag=true;
            }
        }
        if(!(flag)){
            System.out.println("Book not found by author: " + name);
        }
    }

    public void removeBook(String ISBN){
        int beforeRemoval = books.size();
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).ISBN.equalsIgnoreCase(ISBN)){
                System.out.print("Book removed: -> " + books.get(i) + "\n");
                books.remove(i);
            }
        }
        if(books.size()==beforeRemoval){
            System.out.printf("!!! Invalid ISBN %s !!!\n", ISBN);
        }
    }

    public void updateBook(){
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).isAvailable==false){
                books.get(i).setAvailable(true);
            }
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        Library L1 = new Library();
        L1.addBook(new Book("Java is life.", "Denis Ritche", "65625", true));
        L1.addBook(new Book("Effective Java", "Joshua Bloch", "65626", true));
        L1.addBook(new Book("Clean Code", "Robert C. Martin", "65627", false));
        L1.addBook(new Book("Java: The Complete Reference", "Herbert Schildt", "65628", true));
        L1.addBook(new Book("Head First Java", "Kathy Sierra", "65629", true));
        L1.displayBook();
        
        System.out.println("\n\nBook by author: ");
        L1.searchBook("denis ritche");
        L1.searchBook("Joshua Bloc");
        
        System.out.println("\n\nRemoved books using ISBN: ");
        L1.removeBook("65620");
        L1.removeBook("65625");
        
        
        L1.displayBook();
        L1.updateBook();
        L1.displayBook();
    }
}