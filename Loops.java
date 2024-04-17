package tasks;

/**
 * This program demonstrates the use of while loop and prints 1 to 10 numbers
 * @author Jayesh Soni
 * @since 2024-04-17
 */
public class Loops {

	// Define the final variable which represents the upper limit of loop
	private final int UPPER_LIMIT = 10;

	/**
	 * This Method prints numbers from 1 to 10  using While Loop
	 */
	public void whileLoop() {
		int lowerLimit = 1;

		System.out.println("\nPrinting values using While Loop");

		// Create While loop to print numbers from 1 to 10
		while (lowerLimit <= UPPER_LIMIT) {
			System.out.println(lowerLimit);
			lowerLimit++;
		}
	}

	/**
	 * This Method prints numbers from 1 to 10  using Do-While Loop
	 */
	public void doWhileLoop() {
		int lowerLimit = 1;

		System.out.println("\nPrinting values using Do-While Loop");

		// Create Do-While loop to print numbers from 1 to 10
		do {
			System.out.println(lowerLimit);
			lowerLimit++;
		} while (lowerLimit <= UPPER_LIMIT);
	}

	public static void main(String[] args) {
		// Create object of the loops class
		Loops loopsObject = new Loops();
		
		// Call the whileLoop method
		loopsObject.whileLoop();
		
		// Call the doWhileLoop method
		loopsObject.doWhileLoop();
	}

}