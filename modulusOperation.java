import java.util.Scanner;

public class modulusOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Read two numbers from the user
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Perform modulus operation
            int result = num1 % num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot perform modulus by zero.");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            scanner.close();
        }
    }
}