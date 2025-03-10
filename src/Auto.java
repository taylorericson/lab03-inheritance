/**
 * Author: Taylor Ericson
 * Class: CSC-240 Computer Science II (Java)
 * Description: This class represents an Auto insurance policy.
 */

public class Auto extends Policy {
	private String make;
	private String model;
	private double liability;
	private double collision;
	
	// Default constructor with default values
    public Auto() {
        super("Default First Name", "Default Last Name", 0.0); // Default names
        this.make = "Default Make";
        this.model = "Default Model";
        this.liability = 0.0;
        this.collision = 0.0;
    }
	
	/**
	 * Auto policy constructor with parameters
	 * 
	 * @param make The make of the car.
	 * @param model The model of the car.
	 * @param liability The amount of liability coverage in dollars.
	 * @param collision The amount of collision coverage in dollars.
	 */
	
	public Auto(String firstName, String lastName, double commission, String make, String model, double liability, double collision) {
		super(firstName, lastName, commission);
		this.make = make;
		this.model = model;
		this.liability = liability;
		this.collision = collision;
	} 
	
	// Calculates commission for Auto policy
	@Override
	public void computeCommission() {
		commission = (liability + collision) * 0.3;
	} 
	
	// Getters and Setters

    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public double getLiability() { return liability; }
    public void setLiability(double liability) { this.liability = liability; }

    public double getCollision() { return collision; }
    public void setCollision(double collision) { this.collision = collision; }

    // Returns a formatted string for Auto policy
	@Override
	public String toString() {
		return "\nAuto Policy\n-----------" +
				super.toString() +
				"\nMake: " + make +
				"\nModel: " + model +
				"\nLiability: $" + String.format("%,.2f", liability) +
				"\nCollision: $" +  String.format("%,.2f", collision) +
				"\nCommission: $" +  String.format("%,.2f", commission);
	} 
} 