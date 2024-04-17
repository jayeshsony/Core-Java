package tasks;
import java.util.Scanner;

/**
 * This Program takes user's age as an input and checks it using if/else statements and displays appropriate message in output
 * @author Jayesh Soni
 * @since 2024-04-16
 */
public class CheckAge {

	public static void main(String[] args) {
		// Create Scanner Object for user input
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Your Age:");
		int age = scanner.nextInt();

		// Check age using if/else statements
		if (age < 0) {
			System.out.println("Invalid Age.");
		} else if (age < 18) {
			System.out.println("You are minor");
		} else if (age < 60) {
			System.out.println("You are an adult.");
		} else {
			System.out.println("You are a senior citizen");
		}
	}

}