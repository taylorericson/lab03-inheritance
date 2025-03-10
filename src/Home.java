/**
 * Author: Taylor Ericson
 * Class: CSC-240 Computer Science II (Java)
 * Description: This class represents a Home insurance policy.
 */

public class Home extends Policy {
	private int footage;
	private double dwelling;
	private double contents;
	private double liability;
	
	// Default constructor with default values
    public Home() {
        super("Default First Name", "Default Last Name", 0.0); // Default names
        this.footage = 0;
        this.dwelling = 0.0;
        this.contents = 0.0;
        this.liability = 0.0;
    }
	
	/**
	 * Home policy constructor with parameters
	 * 
	 * @param footage The square footage of the Home.
	 * @param dwelling The amount of dwelling coverage in dollars.
	 * @param contents The amount of contents coverage in dollars.
	 * @param liability The amount of liability coverage in dollars.
	 */
	
	public Home(String firstName, String lastName, double commission, int footage, double dwelling, double contents, double liability) {
		super(firstName, lastName, commission);
		this.footage = footage;
		this.dwelling = dwelling;
		this.contents = contents;
		this.liability = liability;
	} 
	
	// Calculates commission for Home policy 
	public void computeCommission() {
		this.commission = (this.liability * 0.3) + ((this.dwelling + this.contents) * 0.2);
	}

	// Getters and Setters
    public int getFootage() { return footage; }
    public void setFootage(int footage) { this.footage = footage; }

    public double getDwelling() { return dwelling; }
    public void setDwelling(double dwelling) { this.dwelling = dwelling; }

    public double getContents() { return contents; }
    public void setContents(double contents) { this.contents = contents; }

    public double getLiability() { return liability; }
    public void setLiability(double liability) { this.liability = liability; }
	
    // Returns a formatted string for Home policy
	@Override
	public String toString() {
		return "\nHome Policy\n-----------" +
				super.toString() + 
				"\nFootage: " + footage + 
				"\nDwelling: $" + String.format("%,.2f", dwelling) + 
				"\nContents: $" + String.format("%,.2f", contents) + 
				"\nLiability: $" + String.format("%,.2f", liability) + 
				"\nCommission: $" + String.format("%,.2f", commission);
	}
}