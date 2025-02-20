package LAB_Problem.Problem9;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private boolean isBorrowed;

    public Book(String title) {
        this.title = title;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println(Thread.currentThread().getName() + " borrowed " + title);
        } else {
            System.out.println(Thread.currentThread().getName() + " could not borrow " + title + " (already borrowed)");
        }
    }
}

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
}

class Reader extends Thread {
    private Library library;
    private String bookTitle;

    public Reader(Library library, String bookTitle) {
        this.library = library;
        this.bookTitle = bookTitle;
    }

    @Override
    public void run() {
        Book book = library.getBook(bookTitle);
        if (book != null) {
            book.borrow();
        } else {
            System.out.println(Thread.currentThread().getName() + " could not find " + bookTitle);
        }
    }
}

class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Java Programming"));
        library.addBook(new Book("Data Structures"));

        Reader reader1 = new Reader(library, "Java Programming");
        Reader reader2 = new Reader(library, "Java Programming");

        reader1.start();
        reader2.start();
    }
}