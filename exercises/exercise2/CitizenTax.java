package exercise2;
public class CitizenTax{
    private String name;
    private double yearly_income;

    public CitizenTax(){
        this.name = "unknown";
        this.yearly_income = 0;
    }

    public CitizenTax(String n, double yearly_inc){
        this.name = n;
        this.yearly_income = yearly_inc;
    }

    public double CalculateTax(){
        int rate = 0;
        if (this.yearly_income < 1000){
            rate = 0;
        } else if (this.yearly_income < 10_000){
            rate = 10;
        } else if (this.yearly_income < 20_200){
            rate = 15;
        } else if (this.yearly_income < 30_750){
            rate = 20;
        } else if (this.yearly_income < 50_000){
            rate = 25;
        } else if (this.yearly_income > 50_000){
            rate = 30;
        }
        double rate_percent = (double) rate / 100;
        return rate_percent * this.yearly_income;
    }

    public void updateIncome(double income){
        this.yearly_income = income;
    }

    public void printinfo(){
        System.out.println("User's name: " + this.name);
        System.out.println("User's yearly income: " + this.yearly_income);
        System.out.println("User's tax: "+ CalculateTax());
    }
}