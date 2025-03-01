public class Salaried extends StaffMember{
    public Salaried(String firstName, String lastName, int id, double payRate) {
        super(firstName, lastName, id, payRate);
    }

    @Override
    public double pay() {
        System.out.println("To be payed: "+this.payRate / 12);
        return this.payRate / 12;
    }
}
