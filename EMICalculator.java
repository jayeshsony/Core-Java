package tasks;

/**
 * This program calculates the EMI 
 * @author Jayesh Soni
 * @since 2024-04-17
 */

/**
 * A class to calculate EMI for loans.
 * This class provides methods to calculate EMI base on principle amount , 
 * annual interest rate and tenure in years.
 */
public class EMICalculator {

	private double principal;
	private double interest;
	private int months;

	/**
	 * This method sets the values of principal, interest, tenureMonths.
	 * @param principal the amount of loan
	 * @param interest the interest rate of the loan
	 * @param months the duration of the loan in months
	 */
	public void SetData(double principal, double interest, int months) {
		this.principal = principal;
		this.interest = interest;
		this.months = months * 12;
	}

	/**
	 * Calculates the EMI for the loan.
	 *
	 * @return the EMI
	 */
	public double calculateEMI() {
		// Convert annual rate to monthly rate
		double monthlyRate = interest / (12 * 100);

		// Calculate EMI using the formula
		double emi = principal * monthlyRate * Math.pow(1 + monthlyRate, months) / (Math.pow(1 + monthlyRate, months) - 1);

		return emi;
	}

	public static void main(String[] args) {
		// Create Object of EMICalculator class
		EMICalculator EMICalculatorObject = new EMICalculator();

		// Call the SetData method
		EMICalculatorObject.SetData(1000000, 8, 5);

		double emi = EMICalculatorObject.calculateEMI();
		System.out.printf("The EMI is: %.2f", emi);
	}

}