/**
 * Author: Taylor Ericson
 * Class: CSC-240 Computer Science II (Java)
 * Description: This is a driver class for an insurance commission calculator. It initializes a 
 * 				CommissionCalculator object and calls its run method to print menu options for the user.
 *  
 */

public class Driver {

	public static void main(String[] args) {
		
		// Create commission calculator
		CommissionCalculator calc = new CommissionCalculator();
		
		// Run commission calculator
		calc.run();
	}

}