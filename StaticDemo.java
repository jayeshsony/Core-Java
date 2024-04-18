package tasks;

/**
 * This program demonstrates the working of static variable, method and block
 *
 * @author Jayesh Soni
 * @since 2024-04-18
 */
public class StaticDemo {

	// Initialize static variable
	static int staticvariable = 100;

	// Static block
	static {
		System.out.println("Static block initialized");
		System.out.println("Value of static variable = " + staticvariable);
	}

	/**
	 * A method of StaticDemo class.
	 * It updates the value of static variable.
	 */
	public void updateStaticvariable() {
		staticvariable += 100;
	}

	/**
	 * A method of StaticDemo class.
	 * This method prints the message indicating static method is initialized.
	 * It also prints the value of static variable
	 */
	static void staticMethod() {
		System.out.println("Static method initialized");
		System.out.println("Value of static variable = " + staticvariable);
	}

	public static void main(String[] args) {
		StaticDemo staticDemoObject1 = new StaticDemo();
		staticDemoObject1.updateStaticvariable();
		staticMethod();

		StaticDemo staticDemoObject2 = new StaticDemo();
		staticDemoObject2.updateStaticvariable();
		staticMethod();
	}

}