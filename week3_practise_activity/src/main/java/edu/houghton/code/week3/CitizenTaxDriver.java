package edu.houghton.code.week3;

public class CitizenTaxDriver {

    public static void main(String[] args) {


        // Input users: ‘Alex’: 500, ‘James’: 20500, ‘Deborah’: 70000
        // Expected result: ‘Alex’: 0, ‘James’: 2490, ‘Deborah’: 15352.5


        //Object declaration
        CitizenTax alex;

        //Object Instantiation using the new keyword
        alex= new CitizenTax("Alex", 500.0);

        //Object declaration and instantiation on the same line
        CitizenTax james= new CitizenTax("James", 20500.0);
        CitizenTax deborah= new CitizenTax("Deborah", 70000.0);

        //method to print out the tax info
        alex.printInfo();
        james.printInfo();
        deborah.printInfo();

        System.out.println("\nUpdating the income of each citizens...\n");
        //calling the updateIncome for each objects
        alex.updateIncome(10600);
        james.updateIncome(34789);
        deborah.updateIncome(90000);

        //method to print out the tax info
        alex.printInfo();
        james.printInfo();
        deborah.printInfo();
    }
}
