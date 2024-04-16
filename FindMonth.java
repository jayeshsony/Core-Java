package tasks;
import java.util.Scanner;

/**
 * This program takes number as user input and displays appropriate month in console
 * @author Jayesh Soni
 * @since 2024-04-16
 *
 */
public class FindMonth {
	public static void main(String[] args) {
	
		//Create Scanner Object for user input
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		int month = scanner.nextInt();
		
		//switch case to find appropriate
		
		switch(month) {
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("October");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("December");
				break;
			default:
				System.out.println("Invalid Number! \nPlease enter a number between 1 to 12.");
				break;
		}
		
	}
}
