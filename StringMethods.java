package tasks;

/**
 * This program demonstrates the various String methods
 * 
 * @author Jayesh Soni
 * @since 2024-04-18
 */
public class StringMethods {

	public static void main(String[] args) {
		String str = "Jayesh Soni"; // Initialize String variable

		// Length of String
		int length = str.length();
		System.out.println("Length of the String is " + length);

		// Convert to Upper class
		String upperCase = str.toUpperCase();
		System.out.println("Uppercase = " + upperCase);

		// Convert to Lower class
		String lowerCase = str.toLowerCase();
		System.out.println("Lowercase = " + lowerCase);

		// Character at specific index
		char charAt = str.charAt(5);
		System.out.println("Character at 5th index : " + charAt);

		// Set character at specific index
		StringBuilder strBuilder = new StringBuilder(str); // Create object of StringBuilder from original string
		strBuilder.setCharAt(10, 'y'); // Replace character at 11th index with 'y'
		String updatedStr = strBuilder.toString(); // Convert StringBuilder back to String
		System.out.println("Updated string = " + updatedStr);

		// Check if it starts with prefix
		boolean startsWith = str.startsWith("Jayesh");
		System.out.println("Is the String starts with \"Jayesh\" = " + startsWith);

		// Check if it ends with suffix
		boolean endsWith = str.endsWith("Soni");
		System.out.println("Is the String ends with \"Soni\" = " + endsWith);

		// Concatenation
		String secondString = "Qdev"; // Initialize string for concatenate
		String concatedStr = str.concat(" " + secondString);
		System.out.println("Concated String = " + concatedStr);

		// Comparing str and secondString
		if (str.equals(secondString)) {
			System.out.println("Both Strings are equal");
		} else {
			System.out.println("Both Strings are not equal");
		}

		// Create substring and assign it to variable
		String subString = str.substring(7); // Substring starts from index 7
		System.out.println("Substring Of str = " + subString);

		// Replace "s" to "S" in str
		String replaced = str.replace("s", "S");
		System.out.println("String after replacing 's' with 'S' = " + replaced);
	}

}