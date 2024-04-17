package tasks;

/**
 * This program demonstrates the use of Default and Parameterized Constructors and calculates the area of circle
 * @author Jayesh Soni
 * @since 2024-04-17
 */
public class Circle {

	// Constant for PI
	private final double PI = 3.14f;

	// Instance variable for radius
	private double radius;

	/**
	 * This default constructor sets the default radius of 0.0
	 */
	public Circle(){
		radius = 0;
	}

	/**
	 * This parameterized constructor sets the specified radius
	 * @param radius the radius of circle
	 */
	public Circle(double radius){
		this.radius = radius;
	}

	/**
	 * This method calculates the area of the circle
	 * @return the area of circle
	 */
	public double CalculateArea() {
		// Calculating Area of circle 
		return PI * radius * radius;
	}

	public static void main(String[] args) {
		// Create Object of Circle class that calls default constructor
		Circle circleObject1 = new Circle();
		System.out.println("Aria of circle with default radius = " + circleObject1.CalculateArea());

		// Create Object of Circle class that calls parameterized constructor
		Circle circleObject2 = new Circle(5.0);
		System.out.println("Aria of circle with specified radius = " + circleObject2.CalculateArea());
	}

}