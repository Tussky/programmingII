public class Salaried extends StaffMember{
    public Salaried(String firstName, String lastName, int id, double payRate) {
        super(firstName, lastName, id, payRate);
    }

    @Override
    public double pay() {
        return this.payRate / 12;
    }
}
