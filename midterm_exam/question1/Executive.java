public class Executive extends Salaried {

    private double bonus;

    public Executive(String firstName, String lastName, int id, double payRate) {
        super(firstName, lastName, id, payRate);
    }

    public void addBonus(double toAddBonus){
        this.bonus += toAddBonus;
        System.out.println("Bonus added, bonus: "+ this.bonus);
    }

    @Override
    public double pay() {
        this.bonus = 0.01*(this.payRate);
        double total = bonus + super.pay();
        this.bonus = 0;
        System.out.println("To be payed: " +total);
        return total;
    }
}
