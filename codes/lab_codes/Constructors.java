package codes.lab_codes;
// Define the Book class
class Book {
    // Fields (Instance Variables)
    String title;
    String author;
    int pages;

    // Constructor to initialize fields
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        System.out.println("A new book object has been created.");
    }

    // Method to display the book's details
    public void displayDetails() {
        System.out.println("Book Details: " + this.title + " by " + this.author + ", " + this.pages + " pages.");
    }
}

// Main class to run the program
public class Constructors {
    public static void main(String[] args) {
        // Create a new Book object, which calls the constructor
        Book myBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);

        // Call the displayDetails method on the object
        myBook.displayDetails();
    }
}