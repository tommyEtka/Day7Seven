package Day7Seven;

import java.util.Scanner;

public class labNumberSeven {

	public static void main(String[] args) {

		System.out.println("Welcome to our Java class. Which student would you"
				+ " like to learn more about? (enter a number 1-20): ");

		Scanner scan1 = new Scanner(System.in);
		int input = scan1.nextInt();
		scan1.nextLine();
		String input2;
		int input1 = 0;
		String input3;
		String choice = "yes";
		String[] studentFirstName = { "Kim", "Heather", "Mary" };
		String[] studentLastName = { "Driscoll", "Grant", "Harp" };
		String[] studentHometown = { "Detroit", "Southfield", "Oakland" };
		String[] studentFavfood = { "Pizza", "Chinese", "Pasta" };

		// for(int i=0; i<input; i++){}

		while (choice.equalsIgnoreCase("yes")) {

			input1 = input - 1;
			if (input >= 1 && input <= 20) {
				// System.out.println("This is in" + input1 );
				System.out.println("Student " + input + " is "
						+ studentFirstName[input1] + " "
						+ studentLastName[input1]
						+ ". What would you like to know about "
						+ studentFirstName[input1] + "?"
						+ " (enter hometown or fav food).");
			    //scan1.nextLine();
				input2 = scan1.nextLine();

				if (input2.equalsIgnoreCase("hometown")) {
					System.out.println(studentFirstName[input1] + " is from "
							+ studentHometown[input1] + "."
							+ " Would you like to know her fav food?");
					//scan1.nextLine();
					input3 = scan1.nextLine();

					if (input3.equalsIgnoreCase("yes")) {
						System.out.println(studentFirstName[input1]
								+ "'s fav food is " + studentFavfood[input1]
								+ ". Would"
								+ " you like to know about another student? ");
						scan1.nextLine();

						if (input3.equalsIgnoreCase("yes")) {
							System.out
									.println("Please enter a number between 1-20.");
							input = scan1.nextInt();

							scan1.nextLine();

						}

					} else {
						System.out.println("goodbye");
						scan1.nextLine();
					}
				}

				else if (input2.equalsIgnoreCase("fav food")) {
					System.out.println(studentFirstName[input1]
							+ "'s fav food is " + studentFavfood[input1]
							+ ". Would you like to know "
							+ studentFirstName[input1] + " hometown?");

					// scan1.nextLine();
					// .
					// you need more code here

					//scan1.nextLine();
					input3 = scan1.nextLine();
					
					if (input3.equalsIgnoreCase("yes")) {
						System.out.println(studentFirstName[input1]
								+ "'s hometown is " + studentHometown[input1]
								+ ". Would"
								+ " you like to know about another student? ");
						//scan1.nextLine();
						input2 = scan1.nextLine();
						//scan1.nextLine();
						
						if (input3.equalsIgnoreCase("yes")) {
							System.out
									.println("Please enter ANOTHER number between 1-20.");
							input = scan1.nextInt();

							scan1.nextLine();
							//input3 = scan1.nextLine();
						} else {
							System.out.println("goodbye");
							scan1.nextLine();
							

						}

					} else {
						System.out.println("goodbye");
						scan1.nextLine();
					}

					// .

				} else {
					System.out.println("That data does not exist");
				}

				// when it's correct

			} else {
				System.out
						.println("That student does not exist. Please try again."
								+ " Enter a number 1-20.");

				input = scan1.nextInt();
				scan1.nextLine();
				// System.out.println(input + " this is the one");
				continue;

			}

		} // this is for the while loop
		scan1.close();

	}
}
