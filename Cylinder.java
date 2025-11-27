public class Cylinder {
    // Private instance variables
    private double radius;
    private double height;

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Method to display cylinder dimensions
    public void displayDimensions() {
        System.out.println("Cylinder Radius: " + radius);
        System.out.println("Cylinder Height: " + height);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Cylinder c = new Cylinder();

        // Set values using setters
        c.setRadius(7.5);
        c.setHeight(12.0);

        // Display values using getters and method
        c.displayDimensions();
        System.out.println("Radius (via getter): " + c.getRadius());
        System.out.println("Height (via getter): " + c.getHeight());
    }
}