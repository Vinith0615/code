public class Book {
    // Instance variables
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Constructor with title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0; // default price
    }

    // Constructor with all fields
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book [Title=" + title + ", Author=" + author + ", Price=" + price + "]");
    }

    // Main method to test all constructors
    public static void main(String[] args) {
        // Using default constructor
        Book book1 = new Book();
        book1.displayDetails();

        // Using constructor with title and author
        Book book2 = new Book("Java Basics", "John Doe");
        book2.displayDetails();

        // Using constructor with all fields
        Book book3 = new Book("Advanced Java", "Jane Smith", 599.99);
        book3.displayDetails();
    }
}