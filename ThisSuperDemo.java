package tasks;

/**
 * This program demonstrates the use of This and Super keywords
 * 
 * @author Jayesh Soni
 * @since 2024-04-18
 */
public class ThisSuperDemo {

	/**
	 * ParentClass contains one constructor and one method that simply displays
	 */
	public static class ParentClass {

		// Initialize variable that store message of Parent class
		final String message = "ParentClass Message";

		// Constructs the ChildClass object
		ParentClass() {
			System.out.println("ParentClass Constructor");
		}

		/**
		 * A method of Parent Class. This method prints message indicating it belongs to
		 * ParentClass.
		 */
		public void parentClassMethod() {
			System.out.println("ParentClass Method");
		}

	}

	public static class ChildClass extends ParentClass {

		// Initialize variable that store message of Child class
		final String message = "ChildClass Message";

		/**
		 * Constructs the ChildClass Object. It calls the constructor of the ParentClass
		 */
		ChildClass() {
			super(); // Call the constructor of Parent class
			System.out.println("ChildClass Constructor");
		}

		/**
		 * A method of ChildClass. This method prints message indicating it belongs to
		 * ChildClass and also calls the method of parent class.
		 */
		public void childClassMethod() {
			super.parentClassMethod(); // Call the method of Parent class
			System.out.println("ChildClass Method");
		}

		/**
		 * A method of ChildClass. 
		 * It demonstrates the use of this and super keyword.
		 */
		public void thisSuperDemoMethod() {
			System.out.println(super.message); // Access the message of Parent class
			System.out.println(this.message); // Access the message of child class
		}
	}

	public static void main(String[] args) {
		// Create Object of ChildClass
		ChildClass childClassObject = new ChildClass();
		childClassObject.childClassMethod();
		childClassObject.thisSuperDemoMethod();
	}

}