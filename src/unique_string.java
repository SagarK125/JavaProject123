public class unique_string {
    // Method to get unique characters from a string
    public static void main(String[] args) {
        // Define the input string
        String input = "Hello, World!";

        // Call the method to get unique characters
        String uniqueChars = getUniqueCharacters(input);

        // Print the result
        System.out.println("Unique characters: " + uniqueChars);
    }
    public static String getUniqueCharacters(String input) {
        // Use a StringBuilder to collect unique characters
        StringBuilder uniqueChars = new StringBuilder();

        // Iterate through each character in the input string
        for (char c : input.toCharArray()) {
            // Check if the character is not already in the uniqueChars
            if (uniqueChars.indexOf(String.valueOf(c)) == -1) {
                uniqueChars.append(c); // Add the character to uniqueChars
            }
        }

        // Return the unique characters as a string
        return uniqueChars.toString();
    }
}
