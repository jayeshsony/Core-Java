package tasks;

/**
 * This program demonstrates the use of Break and Continue statements
 * @author Jayesh Soni
 * @since 2024-04-17
 */
public class BreakContinue {

	// Declare final variable which represents the upper limit of loop
	private final int UPPER_LIMIT = 10;

	/**
	 * This method demonstrates the use of Break statement
	 */
	public void BreakStatements() {
		System.out.println("\nOutput of Break Statement :");

		for (int i = 1; i <= UPPER_LIMIT; i++) {
			if (i == 8) {
				break; // Stops the iteration when the if condition is satisfied
			}
			System.out.println(i);
		}
	}

	/**
	 * This method demonstrates the use of Continue statement
	 */
	public void ContinueStatements() {
		System.out.println("\nOutput of Continue Statement :");

		for (int i = 1; i <= UPPER_LIMIT; i++) {
			if (i == 8) {
				continue; // Skips the current iteration and goes to next iteration of loop
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// Create Object of BreakContinue class
		BreakContinue breakContinueObject = new BreakContinue();

		// Call the BreakStatements method
		breakContinueObject.BreakStatements();

		// Call the ContinueStatement method
		breakContinueObject.ContinueStatements();
	}

}