public class volume {
    // Private instance variables
    private double radius;
    private double height;

    // Getter and Setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter and Setter for height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate surface area
    public double getSurfaceArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    // Method to calculate volume
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    // Main method to test
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setRadius(7);
        c.setHeight(10);

        System.out.println("Radius: " + c.getRadius());
        System.out.println("Height: " + c.getHeight());
        System.out.printf("Surface Area: %.2f\n", c.getSurfaceArea());
        System.out.printf("Volume: %.2f\n", c.getVolume());
    }
}