public class Book {
//The object class
Exercise:
    private String title;
    private int price;

    // Constructor
    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Book[title=" + title + ", price=" + price + "]";
    }

    // Main method to test
    public static void main(String[] args) {
        Book myBook = new Book("Java", 500);
        System.out.println(myBook);  // Automatically calls toString()
    }
}