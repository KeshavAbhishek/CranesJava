package LAB_Problem.Problem2;

class LibraryItem {
    int id;
    String title;
    String author;
    int publicationYear;
    boolean available;

    public LibraryItem(int id, String title, String author, int publicationYear) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.available = true;
    }

    public void checkOut() {
        if (available) {
            available = false;
            System.out.println(title + " has been checked out.");
        } else {
            System.out.println(title + " is already checked out.");
        }
    }

    public void returnItem() {
        available = true;
        System.out.println(title + " has been returned.");
    }

    public boolean isAvailable() {
        return available;
    }

    public String getDetails() {
        return "ID: " + id + ", Title: " + title + ", Author: " + author +
                ", Year: " + publicationYear + ", Available: " + available;
    }
}

class Book extends LibraryItem {
    String ISBN;
    String genre;
    int pages;

    public Book(int id, String title, String author, int publicationYear, String ISBN, String genre, int pages) {
        super(id, title, author, publicationYear);
        this.ISBN = ISBN;
        this.genre = genre;
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public int getPageCount() {
        return pages;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", ISBN: " + ISBN + ", Genre: " + genre + ", Pages: " + pages;
    }
}

class Journal extends LibraryItem {
    String ISSN;
    int volume;
    int issueNumber;

    public Journal(int id, String title, String author, int publicationYear, String ISSN, int volume, int issueNumber) {
        super(id, title, author, publicationYear);
        this.ISSN = ISSN;
        this.volume = volume;
        this.issueNumber = issueNumber;
    }

    public int getVolume() {
        return volume;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", ISSN: " + ISSN + ", Volume: " + volume + ", Issue: " + issueNumber;
    }
}

class DVD extends LibraryItem {
    int duration;
    String format;
    String regionCode;

    public DVD(int id, String title, String author, int publicationYear, int duration, String format,
            String regionCode) {
        super(id, title, author, publicationYear);
        this.duration = duration;
        this.format = format;
        this.regionCode = regionCode;
    }

    public int getDuration() {
        return duration;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Duration: " + duration + " mins, Format: " + format + ", Region Code: "
                + regionCode;
    }
}

class Library {
    LibraryItem[] items;
    int itemCount;

    public Library(int capacity) {
        this.items = new LibraryItem[capacity];
        this.itemCount = 0;
    }

    public void addItem(LibraryItem item) {
        if (itemCount < items.length) {
            items[itemCount++] = item;
            System.out.println("Added: " + item.getDetails());
        } else {
            System.out.println("Library is full. Cannot add more items.");
        }
    }

    public boolean removeItem(int id) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].id == id) {
                items[i] = items[--itemCount];
                items[itemCount] = null;
                System.out.println("Removed item with ID: " + id);
                return true;
            }
        }
        System.out.println("Item with ID " + id + " not found.");
        return false;
    }

    public LibraryItem searchItem(String title) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].title.equalsIgnoreCase(title)) {
                return items[i];
            }
        }
        System.out.println("Item with title '" + title + "' not found.");
        return null;
    }

    public void displayAllItems() {
        if (itemCount == 0) {
            System.out.println("No items in the library.");
            return;
        }
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i].getDetails());
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library(10);

        Book book = new Book(1, "The God of Small Things", "Arundhati Roy", 1997, "9780679457312", "Fiction", 340);
        Journal journal = new Journal(2, "Indian Journal of Science and Technology", "Various", 2023, "0974-6846", 15,
                8);
        DVD dvd = new DVD(3, "Lagaan", "Ashutosh Gowariker", 2001, 224, "DVD", "Region 5");

        library.addItem(book);
        library.addItem(journal);
        library.addItem(dvd);

        System.out.println("\nDisplaying all items:");
        library.displayAllItems();

        System.out.println("\nChecking out a book:");
        book.checkOut();

        System.out.println("\nReturning the book:");
        book.returnItem();

        System.out.println("\nSearching for a journal:");
        LibraryItem foundItem = library.searchItem("Nature");
        if (foundItem != null) {
            System.out.println("Found: " + foundItem.getDetails());
        }

        System.out.println("\nRemoving an item:");
        library.removeItem(2);

        System.out.println("\nDisplaying all items after removal:");
        library.displayAllItems();
    }
}