package tasks;

/**
 * This program displays Star Pattern
 * @author Jayesh Soni
 * @since 2024-04-17
 */
public class StarPattern {

	public static void main(String[] args) {
		// Initialize and declare variable that shows number of rows in the pattern
		final int ROWS = 5;

		// Outer For loop to iterate through rows
		for(int i = 1; i <= ROWS; i++)
		{
			// Inner for loop to print stars
			for(int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	
}