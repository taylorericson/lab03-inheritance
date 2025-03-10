/**
 * Author: Taylor Ericson
 * Class: CSC-240 Computer Science II (Java)
 * Description: This class represents a Life insurance policy.
 */

public class Life extends Policy {
	private int age;
	private double term;
	
	// Default constructor with default values
    public Life() {
        super("Default First Name", "Default Last Name", 0.0); // Default names
        this.age = 0;
        this.term = 0.0;
    }
	
	/**
	 * Life policy constructor with parameters
	 * 
	 * @param age The age of the Life policy holder.
	 * @param term The amount of term life coverage in dollars.
	 */
	
	public Life(String firstName, String lastName, double commission, int age, double term) {
		super(firstName, lastName, commission);
		this.age = age;
		this.term = term;
	}
	
	// Calculates commission for Life policy
	@Override
	public void computeCommission() {
		this.commission = term * .2;
	}
	
	// Getters and Setters
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getTerm() { return term; }
    public void setTerm(double term) { this.term = term; }
    
    // Returns a formatted string for Life policy
    @Override
    public String toString() {
    	return "\nLife Policy\n-----------" + 
    			super.toString() + 
    			"\nAge: " + age +
    			"\nTerm: $" + String.format("%,.2f", term) +
    			"\nCommission: $" + String.format("%,.2f", commission);
    }
}