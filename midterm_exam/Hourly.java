public class Hourly extends StaffMember {
    private double hours;
    public Hourly(String firstName, String lastName, int id, double payRate) {
        super(firstName, lastName, id, payRate);
    }

    public void addHours(double numHours){
        System.out.println("Added "+numHours+"hrs, total: " + this.hours);
        this.hours += numHours;
    }

    @Override
    public double pay() {
        if (this.hours < 80 ){
            System.out.println("Not enough hours");
            return 0;
        }
        else {
            System.out.println("To be payed:" + (this.hours * this.payRate));
            return this.hours * this.payRate;
        }
    }
}
