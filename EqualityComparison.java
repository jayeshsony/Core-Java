package tasks;

import java.math.BigDecimal;

/**
 * This program demonstrates the difference between '==' and '.equals()' methods
 * by comparing String, Integer and BigDecimal
 * 
 * @author Jayesh Soni
 * @since 2024-04-18
 */
public class EqualityComparison {

	public static void main(String[] args) {
		// String Comparison
		String name1 = "Jayesh";
		String name2 = "Jayesh";
		String name3 = new String("Jayesh");

		System.out.println("\nString Comparison \nDifference using '==' operator");
		System.out.println(name1 == name2); // True because the reference is same
		System.out.println(name1 == name3); // False because the reference is different

		System.out.println("Difference using '.equals()' method");
		System.out.println(name1.equals(name2)); // True because the content is same
		System.out.println(name1.equals(name3)); // True because the content is same

		// Integer Comparison
		Integer value1 = 150;
		Integer value2 = 150;

		System.out.println("\nInteger Comparison \nDifference using '==' operator");
		System.out.println(value1 == value2); // False because value is outside the caching range(-128 to 127)

		System.out.println("Difference using '.equals()' method");
		System.out.println(value1.equals(value2)); // True because the content is same

		// BigDecimal Comparison
		BigDecimal decimalValue1 = new BigDecimal(1.1);
		BigDecimal decimalValue2 = new BigDecimal(1.1);
		BigDecimal decimalValue3 = new BigDecimal(1.11);

		System.out.println("\nBigDecimal Comparison \nDifference using '==' operator");
		System.out.println(decimalValue1 == decimalValue2); // False because the reference is different
		System.out.println(decimalValue1 == decimalValue3); // False because the reference is different

		System.out.println("Difference using '.equals()' method");
		System.out.println(decimalValue1.equals(decimalValue2)); // True because the content is same
		System.out.println(decimalValue1.equals(decimalValue3)); // False because the content is different
	}

}