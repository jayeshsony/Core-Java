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
		String string1 = "Jayesh";
		String string2 = "Jayesh";
		String string3 = new String("Jayesh");

		System.out.println("\nString Comparison \nDifference using '==' operator");
		System.out.println(string1 == string2); // True because the reference is same
		System.out.println(string1 == string3); // False because the reference is different

		System.out.println("Difference using '.equals()' method");
		System.out.println(string1.equals(string2)); // True because the content is same
		System.out.println(string1.equals(string3)); // True because the content is same

		// Integer Comparison
		Integer int1 = 150;
		Integer int2 = 150;

		System.out.println("\nInteger Comparison \nDifference using '==' operator");
		System.out.println(int1 == int2); // False because value is outside the caching range(-128 to 127)

		System.out.println("Difference using '.equals()' method");
		System.out.println(int1.equals(int2)); // True because the content is same

		// BigDecimal Comparison
		BigDecimal bigDecimal1 = new BigDecimal(1.1);
		BigDecimal bigDecimal2 = new BigDecimal(1.1);
		BigDecimal bigDecimal3 = new BigDecimal(1.11);

		System.out.println("\nBigDecimal Comparison \nDifference using '==' operator");
		System.out.println(bigDecimal1 == bigDecimal2); // False because the reference is different
		System.out.println(bigDecimal1 == bigDecimal3); // False because the reference is different

		System.out.println("Difference using '.equals()' method");
		System.out.println(bigDecimal1.equals(bigDecimal2)); // True because the content is same
		System.out.println(bigDecimal1.equals(bigDecimal3)); // False because the content is different
	}

}