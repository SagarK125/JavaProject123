public class Prime_Number {
    public static void main(String[] args) {
        // Define the number to check for primality
        int number = 29; // You can change this number to check for a different number
        boolean isPrime = true; // Assume the number is prime initially

        // Check if the number is less than 2, which are not prime numbers
        if (number < 2) {
            isPrime = false;
        } else {
            // Check for factors from 2 to the square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // If a factor is found, it's not prime
                    break; // No need to check further
                }
            }
        }

        // Print the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
