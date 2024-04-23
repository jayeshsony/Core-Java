package tasks;

/**
 * This program Demonstrates comparison of two variables of wrapper class
 * 
 * @author Jayesh Soni
 * @since 2024-04-18
 */
public class WrapperClass {

	public static void main(String[] args) {
		// Initialize variables of Wrapper class
		Integer number1 = 10;
		Integer number2 = 20;

		// Compare two variables
		int compareResult = number1.compareTo(number2);

		// Print the result of comparison using if/else statements
		if (compareResult > 0) {
			System.out.println("Number 1 is Less than Number 2");
		} else if (compareResult < 0) {
			System.out.println("Number 1 is greater than Number2");
		} else {
			System.out.println("Number 1 is eqaul to Number 2");
		}
	}

}