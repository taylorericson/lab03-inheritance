public abstract class Policy {
    private String firstName;
    private String lastName;
    protected double commission;
    
    // Empty Constructor
    public Policy () { commission = 0.0; }

    // Constructor
    public Policy(String firstName, String lastName, double commission) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.commission = commission;
    }
    
    // Abstract method to be implemented in Auto, Home, and Life
    public abstract void computeCommission();

    // Getters and Setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public double getCommission() { return commission; }
    public void setCommission(double commission) { this.commission = commission; }
    
    @Override
    public String toString() {
        return "\nName: " + firstName + " " + lastName;
    }
}
