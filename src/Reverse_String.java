public class Reverse_String {
    // Method to reverse a string
    public static String reverseString(String input) {
        // Create a StringBuilder to hold the reversed string
        StringBuilder reversed = new StringBuilder(input);

        // Reverse the string using StringBuilder's reverse method
        return reversed.reverse().toString();
    }
    public static void main(String[] args) {
        // Define the string to be reversed
        String original = "Hello, World!";

        // Call the reverseString method and store the result
        String reversed = reverseString(original);

        // Print the reversed string
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
