public class Reverse_No {
    public static void main(String[] args) {
        // Define the number to be reversed
        int number = 12345; // You can change this number to reverse a different number
        int reversedNumber = 0;

        // Reverse the number
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
            number /= 10; // Remove the last digit
        }

        // Print the reversed number
        System.out.println("Reversed Number: " + reversedNumber);
    }
}
