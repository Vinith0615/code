public class Rectangle {
    private int length;
    private int breadth;

    // Constructor 1: Default values (4 and 5)
    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    // Constructor 2: Custom values
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to display rectangle dimensions
    public void display() {
        System.out.println("Length: " + length + ", Breadth: " + breadth);
    }

    // Main method to test both constructors
    public static void main(String[] args) {
        // Using default constructor
        Rectangle defaultRect = new Rectangle();
        System.out.print("Default Rectangle → ");
        defaultRect.display();

        // Using parameterized constructor
        Rectangle customRect = new Rectangle(10, 7);
        System.out.print("Custom Rectangle → ");
        customRect.display();
    }
}