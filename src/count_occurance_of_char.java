public class count_occurance_of_char {
    public static void main(String[] args) {
        // Define the string and the character to count
        String str = "Hello, World!";
        char charToCount = 'o';
        int count = 0;

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // If the current character matches charToCount, increment the count
            if (str.charAt(i) == charToCount) {
                count++;
            }
        }

        // Print the result
        System.out.println("The character '" + charToCount + "' occurs " + count + " times in the string.");
    }
}
