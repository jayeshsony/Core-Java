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
	public static class ProjectManager {

		// Initialize variable that store message of Parent class
		final String message = "Project manager Message";

		// Constructs the ChildClass object
		ProjectManager() {
			System.out.println("ProjectManager Constructor");
		}

		/**
		 * A method of ProjectManager Class. This method prints message indicating it belongs to
		 * ProjectManager class.
		 */
		public void printProjectManagerMessage() {
			System.out.println("ProjectManager Method");
		}

	}

	public static class Team extends ProjectManager {

		// Initialize variable that store message of Child class
		final String message = "Team Message";

		/**
		 * Constructs the Team class object. It calls the constructor of the ProjectManager class
		 */
		Team() {
			super(); // Call the constructor of ProjectManager class
			System.out.println("ChildClass Constructor");
		}

		/**
		 * A method of Team class. This method prints message indicating it belongs to
		 * Team class and also calls the method of ProjectManager class.
		 */
		public void printTeamMessage() {
			super.printProjectManagerMessage(); // Call the method of ProjectManager class
			System.out.println("Team Method");
		}

		/**
		 * A method of Team class. 
		 * It demonstrates the use of this and super keyword.
		 */
		public void displayMessages() {
			System.out.println(super.message); // Access the message of ProjectManger class
			System.out.println(this.message); // Access the message of Team class
		}
	}

	public static void main(String[] args) {
		// Create Object of Team class
		Team teamInstance = new Team();
		teamInstance.printTeamMessage();
		teamInstance.displayMessages();
	}

}