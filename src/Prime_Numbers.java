public class Prime_Numbers {
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // Check if the number is less than 2, which are not prime numbers
        if (number <= 1) {
            return false;
        }
        // Check for factors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If a factor is found, it's not prime
            }
        }
        return true; // If no factors found, it is prime
    }
    public static void main(String[] args) {
        // Define the range for prime number generation
        int start = 1; // You can change this to any starting number
        int end = 100; // You can change this to any ending number

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        // Loop through the range and check for prime numbers
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " "); // Print the prime number
            }
        }
    }
}
