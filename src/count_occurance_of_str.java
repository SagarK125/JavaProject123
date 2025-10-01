public class count_occurance_of_str {
    public static void main(String[] args) {
        // Define the string and the substring to count
        String str = "Hello, World! Hello, Universe!";
        String substr = "Hello";
        int count = 0;
        int index = 0;

        // Loop to find all occurrences of the substring
        while ((index = str.indexOf(substr, index)) != -1) {
            count++;
            index += substr.length(); // Move to the next position after the found substring
        }

        // Print the result
        System.out.println("The substring \"" + substr + "\" occurs " + count + " times in the string.");
    }
}
