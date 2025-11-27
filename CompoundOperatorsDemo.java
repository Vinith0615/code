public class CompoundOperatorsDemo {
    public static void main(String[] args) {
        int num = 10;

        System.out.println("Initial value: " + num);

        // += operation
        num += 5;  // Equivalent to num = num + 5
        System.out.println("After += 5: " + num);

        // -= operation
        num -= 3;  // Equivalent to num = num - 3
        System.out.println("After -= 3: " + num);

        // *= operation
        num *= 2;  // Equivalent to num = num * 2
        System.out.println("After *= 2: " + num);
    }
}