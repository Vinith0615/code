import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two integers
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        // Perform operations
        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1 * num2;

        System.out.println("\nResults:");
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + prod);

        try {
            int quotient = num1 / num2;
            int remainder = num1 % num2;
            System.out.println("Quotient = " + quotient);
            System.out.println("Remainder = " + remainder);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division or modulus by zero is not allowed.");
        }

        sc.close();
    }
}