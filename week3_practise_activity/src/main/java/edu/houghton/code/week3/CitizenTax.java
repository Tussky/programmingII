package edu.houghton.code.week3;

/**
 * Sample Solution
 */
public class CitizenTax {

    //instance variable declaration
    private String name;
    private double income;

    /**
     * Default constructor
     * Initializes the name as none and income to 0.0
     */
    public CitizenTax() {
        name = "none";
        income = 0.0;
    }

    /**
     * Constuctor
     * @param name : name of the citizen
     * @param income : yearly income of the citizen
     */
    public CitizenTax(String name, double income){
        this.name = name;
        this.income = income;
    }

    /**
     * Method to calculate the tax of the citizen
     * @return the calculated tax of the citizen
     */
    public double calculateTax() {
        double temp_income= income;
        double tax=0;
        double diff;

        if (temp_income > 50000) {
            diff=(temp_income - 50000);
            tax += diff * 0.3;
            temp_income -= diff;
        }

        if (temp_income > 30750) {
            diff=(temp_income - 30750);
            tax += diff * 0.25;
            temp_income -= diff;
        }

        if (temp_income > 20200) {
            diff=(temp_income - 20200);
            tax += diff * 0.2;
            temp_income -= diff;
        }

        if (temp_income > 10000) {
            diff=(temp_income - 10000);
            tax += diff * 0.15;
            temp_income -= diff;
        }

        if (temp_income > 1000) {
            diff=(temp_income - 1000);
            tax += diff * 0.1;
            temp_income -= diff;
        }

        if (temp_income <= 1000) {
            tax += 0;
        }
        return tax;
    }

    /**
     * Method to print out the citizen's name, income and tax information
     */
    public void printInfo() {
        double tax= calculateTax();
        System.out.printf("Name: %s \tIncome: $%.2f \tTax: $%.3f \n", name, income, tax);
    }

    /**
     * Method to update the income of the citizen
     * @param income
     */
    public void updateIncome(double income) {
        this.income = income;
    }
}
