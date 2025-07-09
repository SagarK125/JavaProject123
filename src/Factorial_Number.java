public class Factorial_Number {
    public static void main(String[] args) {
        // Calculate the factorial of a number
        int number = 5; // You can change this number to calculate the factorial of a different number
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply the current value of factorial by i
        }

        // Print the result
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
