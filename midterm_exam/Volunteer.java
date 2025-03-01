public class Volunteer extends StaffMember{
    public Volunteer(String firstName, String lastName, int id, double payRate) {
        super(firstName, lastName, id, payRate);
    }

    @Override
    public double pay() {
        return 0;
    }
}
