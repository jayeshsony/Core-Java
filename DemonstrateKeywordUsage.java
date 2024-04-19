package tasks;

/**
 * This program demonstrates the use of This and Super keywords
 * 
 * @author Jayesh Soni
 * @since 2024-04-18
 */
public class DemonstrateKeywordUsage {

	/**
	 * ParentClass contains one constructor and one method that simply displays
	 */
	public static class Parent {

		// Initialize variable that store message of Parent class
		final String message = "ParentClass Message";

		// Constructs the ChildClass object
		Parent() {
			System.out.println("ParentClass Constructor");
		}

		/**
		 * A method of Parent Class. This method prints message indicating it belongs to
		 * ParentClass.
		 */
		public void printParentMessage() {
			System.out.println("ParentClass Method");
		}

	}

	public static class Child extends Parent {

		// Initialize variable that store message of Child class
		final String message = "ChildClass Message";

		/**
		 * Constructs the ChildClass Object. It calls the constructor of the ParentClass
		 */
		Child() {
			super(); // Call the constructor of Parent class
			System.out.println("ChildClass Constructor");
		}

		/**
		 * A method of ChildClass. This method prints message indicating it belongs to
		 * ChildClass and also calls the method of parent class.
		 */
		public void printChildMessage() {
			super.printParentMessage(); // Call the method of Parent class
			System.out.println("ChildClass Method");
		}

		/**
		 * A method of ChildClass. 
		 * It demonstrates the use of this and super keyword.
		 */
		public void displayMessages() {
			System.out.println(super.message); // Access the message of Parent class
			System.out.println(this.message); // Access the message of child class
		}
	}

	public static void main(String[] args) {
		// Create Object of ChildClass
		Child childInstance = new Child();
		childInstance.printChildMessage();
		childInstance.displayMessages();
	}

}