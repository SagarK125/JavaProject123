public class armstrong_number {
    public static void main(String[] args) {
        // Define the number to check
        int number = 153; // You can change this number to check for a different Armstrong number
        int originalNumber = number;
        int sum = 0;

        // Calculate the number of digits in the number
        int digits = String.valueOf(number).length();

        // Calculate the sum of the digits raised to the power of the number of digits
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            sum += Math.pow(digit, digits); // Add the digit raised to the power of digits
            number /= 10; // Remove the last digit
        }

        // Check if the sum is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
