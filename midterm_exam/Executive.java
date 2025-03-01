public class Executive extends Salaried {
    public Executive(String firstName, String lastName, int id, double payRate) {
        super(firstName, lastName, id, payRate);
    }

    @Override
    public double pay() {
        double bonus = 0.01*(this.payRate);
        double total = bonus + super.pay();
        bonus = 0;
        return total;
    }
}
