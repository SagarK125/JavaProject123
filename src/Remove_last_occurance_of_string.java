public class Remove_last_occurance_of_string {
    public static void main(String[] args) {
        // Example string
        String str = "Hello, World! Hello, Universe!";
        String toRemove = "Hello";

        // Remove the last occurrence of the specified string
        String result = removeLastOccurrence(str, toRemove);

        // Print the result
        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + result);
    }

    public static String removeLastOccurrence(String str, String toRemove) {
        int lastIndex = str.lastIndexOf(toRemove);
        if (lastIndex == -1) {
            return str; // Return original string if substring not found
        }
        return str.substring(0, lastIndex) + str.substring(lastIndex + toRemove.length());
    }
}
