public class Fibonacci_Series {
    public static void main(String[] args) {
        // Define the number of terms in the Fibonacci series
        int n = 10; // You can change this value to generate more or fewer terms

        // Initialize the first two terms of the Fibonacci series
        int a = 0, b = 1;

        // Print the first two terms
        System.out.print("Fibonacci Series: " + a + ", " + b);

        // Generate and print the next terms in the series
        for (int i = 2; i < n; i++) {
            int nextTerm = a + b; // Calculate the next term
            System.out.print(", " + nextTerm); // Print the next term
            a = b; // Update a to the previous term
            b = nextTerm; // Update b to the current term
        }

        System.out.println(); // Print a new line at the end
    }
}
