import java.util.Scanner;

class StringFun {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Ask the user to input the size of the string
        System.out.print("Enter the number of characters: ");
        int n = scn.nextInt();

        // Read the string characters as a single input
        scn.nextLine(); // Consume the newline character left by nextInt

        System.out.print("Enter the string: ");
        String original = scn.nextLine();

        // Validate the string length
        if (original.length() != n) {
            System.out.println("Error: You entered " + original.length() + " characters, but expected " + n + ".");
            return; // Exit the program early due to invalid input
        }

        // Display the original string
        System.out.println("Original String: " + original);

        // Reverse the string using StringBuilder
        String reverse = new StringBuilder(original).reverse().toString();

        // Display the reversed string
        System.out.println("Reverse String: " + reverse);

        // Display the concatenated string
        System.out.println("Concatenated String: " + original + " ↔ " + reverse);
    }
}
