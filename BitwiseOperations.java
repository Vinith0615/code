import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two integers
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        // Perform bitwise operations
        int andResult = a & b;
        int orResult = a | b;
        int xorResult = a ^ b;

        // Display results in binary format
        System.out.println("\nBitwise Operation Results:");
        System.out.println("a        = " + a + " (" + Integer.toBinaryString(a) + ")");
        System.out.println("b        = " + b + " (" + Integer.toBinaryString(b) + ")");
        System.out.println("a & b    = " + andResult + " (" + Integer.toBinaryString(andResult) + ")");
        System.out.println("a | b    = " + orResult + " (" + Integer.toBinaryString(orResult) + ")");
        System.out.println("a ^ b    = " + xorResult + " (" + Integer.toBinaryString(xorResult) + ")");

        sc.close();
    }
}