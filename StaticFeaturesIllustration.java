package tasks;

/**
 * This program demonstrates the working of static variable, method and block
 *
 * @author Jayesh Soni
 * @since 2024-04-18
 */
public class StaticFeaturesIllustration {

	// Initialize static variable
	static int staticValue = 100;

	// Static block
	static {
		System.out.println("Static block initialized");
		System.out.println("Value of static variable = " + staticValue);
	}

	/**
	 * A method of StaticDemo class. It updates the value of static variable.
	 */
	public void updateStaticValue() {
		staticValue += 100;
	}

	/**
	 * A method of StaticDemo class.
	 * This method prints the message indicating static method is initialized.
	 * It also prints the value of static variable.
	 */
	static void printStaticInfo() {
		System.out.println("Static method initialized");
		System.out.println("Value of static variable = " + staticValue);
	}

	public static void main(String[] args) {
		// Create first object of StaticFeaturesIllustration class
		StaticFeaturesIllustration firstInstance = new StaticFeaturesIllustration();
		staticDemoObject1.updateStaticValue();
		printStaticInfo();

		// Create first object of StaticFeaturesIllustration class
		StaticFeaturesIllustration secondInstance = new StaticFeaturesIllustration();
		staticDemoObject2.updateStaticValue();
		printStaticInfo();
	}

}