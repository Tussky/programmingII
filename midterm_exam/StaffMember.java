public abstract class StaffMember {
    public String firstName;
    public String lastName;
    public int id;
    public double payRate;
    
    public StaffMember(String firstName, String lastName, int id, double payRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.payRate = payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void pay(){};
}
