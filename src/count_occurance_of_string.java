public class count_occurance_of_string {
    public static void main(String[] args) {
        // Example string
        String str = "Hello, World! Hello, Universe! Hello!";
        String toCount = "Hello";

        // Count occurrences of the specified string
        int count = countOccurrences(str, toCount);

        // Print the result
        System.out.println("The string \"" + toCount + "\" occurs " + count + " times in the given text.");
    }
    public static int countOccurrences(String str, String toCount) {
        int count = 0;
        int index = 0;

        // Loop to find all occurrences of the substring
        while ((index = str.indexOf(toCount, index)) != -1) {
            count++;
            index += toCount.length(); // Move to the next position after the found substring
        }

        return count;
    }
}
