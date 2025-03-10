/**
 * Author: Taylor Ericson
 * Class: CSC-240 Computer Science II (Java)
 * Description: This class manages objects representing Auto, Home, and Life insurance policies. 
 * 				It allows the user to enter policy information, compute commissions, 
 * 				and display policy information.
 */

import java.util.Scanner;

public class CommissionCalculator {
	// Instances of Auto, Home, and Life insurance policies
	private Auto auto;
	private Home home;
	private Life life;
	
	// Scanner for user input
	private Scanner scanner;
	
	// Constructor method
	public CommissionCalculator() {
		auto = new Auto();
		home = new Home();
		life = new Life();
		scanner = new Scanner(System.in);
	}
	
	/**
	 * Runs a menu loop, allowing the user to enter policy information, compute commissions,
	 * and print policy information.
	 */
	public void run() {
		int choice = 0;
		
		// Menu loop runs until the user enters the option to quit
		while(choice != 7) {
			System.out.println("\n-----------------------------" +
					"\nWelcome to Parkland Insurance" +
					"\n-----------------------------" +
					"\nEnter any of the following:" +
					"\n1) Enter auto insurance policy information" + 
					"\n2) Enter home insurance policy information" +
					"\n3) Enter life insurance policy information" + 
					"\n4) Compute commission and print auto policy" +
					"\n5) Compute commission and print home policy" +
					"\n6) Compute commission and print life policy" +
					"\n7) Quit");
			
			// Ensure valid input
			if(scanner.hasNextInt()) {
				choice = scanner.nextInt();
				scanner.nextLine(); // Consume newLine
			} else {
				System.out.println("\nInvalid input. Please enter a number between 1 and 7.");
				scanner.nextLine(); // Consume newLine
				continue; // Restart menu loop
			}
			
			if (choice == 1) {
				// Get auto policy information from user
				autoInfo();
			} else if (choice == 2) {
				// Get home policy information from user
				homeInfo();
			} else if (choice == 3) {
				// Get life policy information from user
				lifeInfo();
			} else if (choice == 4) {
				// Compute commission and print out auto policy
				auto.computeCommission();
				System.out.println(auto);
			} else if (choice == 5) {
				// Compute commission and print out home policy
				home.computeCommission();
				System.out.println(home);
			} else if (choice == 6) {
				// Compute commission and print out life policy
				life.computeCommission();
				System.out.println(life);
			} else if (choice == 7) {
				// Exit message
				System.out.println("\nThanks for choosing Parkland Insurance!");
			} else {
				// Handle invalid menu choice
				System.out.println("\nInvalid choice. Please enter a valid menu option.");
			}
		}
	}

	// Get auto policy information from user
	private void autoInfo() {
		System.out.print("Enter first name of insured: ");
		auto.setFirstName(scanner.nextLine());
		System.out.print("Enter last name of insured: ");
		auto.setLastName(scanner.nextLine());
		System.out.print("Enter make of vehicle: ");
		auto.setMake(scanner.nextLine());
		System.out.print("Enter model of vehicle: ");
		auto.setModel(scanner.nextLine());
		System.out.print("Enter amount of liability: $");
		auto.setLiability(scanner.nextDouble());
		System.out.print("Enter amount of collision: $");
		auto.setCollision(scanner.nextDouble());
		scanner.nextLine(); // Consume newLine
	}
	
	// Get home policy information from user
	private void homeInfo() {
		System.out.print("Enter first name of insured: ");
		home.setFirstName(scanner.nextLine());
		System.out.print("Enter last name of insured: ");
		home.setLastName(scanner.nextLine());
		System.out.print("Enter house square footage: ");
		home.setFootage(scanner.nextInt());
		System.out.print("Enter amount of dwelling: $");
		home.setDwelling(scanner.nextDouble());
		System.out.print("Enter amount of contents: $");
		home.setContents(scanner.nextDouble());
		System.out.print("Enter amount of liability: $");
		home.setLiability(scanner.nextDouble());
		scanner.nextLine(); // Consume newLine
	}
	
	// Get life policy information from user
	private void lifeInfo() {
		System.out.print("Enter first name of insured: ");
		life.setFirstName(scanner.nextLine());
		System.out.print("Enter last name of insured: ");
		life.setLastName(scanner.nextLine());
		System.out.print("Enter age of insured: ");
		life.setAge(scanner.nextInt());
		System.out.print("Enter amount of term: $");
		life.setTerm(scanner.nextDouble());
		scanner.nextLine(); // Consume newLine
	}
}