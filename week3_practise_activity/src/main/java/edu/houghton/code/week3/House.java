package edu.houghton.code.week3;

/**
 * Name : (Isaac)
 * Course: CSCI 218 - Programming II
 *
 * Todo:
 *
 * Private instance variables to store age of the House, its type (Detached, Semi-Attached, Attached) and its cost.
 

 * 4 constructors: No argument (sets age to 50, type to Attached and cost to 100000), one argument constructor (sets cost to a value, age - 50 and type - Attached), two argument constructors (sets age to a value, cost to a value , and type to Attached), three argument constructors (sets age to a value, cost to a value, and type to Attached, semi-detached, or detached)
 *
 * 3 Accessor/Getter methods: - methods to return age, type and cost respectively
 *
 * 5 Mutator/Setter methods: - 3 methods for setting the three values independently, a method to set all three values and a method to set age and cost of the house.
 *
 * A public method called estimatePrice() that returns cost of a house based on type and age. An attached cost $100,000, appreciates 1% every year in first five years and 2% every year afterwards. A Semidetached cost $150,000, appreciates 2% every year in first five years and 3% every year afterwards. A detached costs $200,000, appreciates 2% every year in first five years and 2% every year afterwards.
 *
 * A toString() method that returns type of the house and its age and its cost.
 *
 * An equals() method to test for equality of two objects of class House based on type and age.
 *
 * isLessThan() and isGreaterThan() method to compare between the prices of two objects of class House.
 *
 *
 * Hints:
 *  You can generate the toString() method and equals() method body by
 */
public class House {

    //declare your variables
    private int age; 
    private String type;
    private int cost;

    //create your constructors
    public House(){
        this.age = 50;
        this.type = "Attached";
        this.cost = 100000;
    }

    public House(int cost){
        this.cost = cost;
        this.age = 50;
        this.type = "Attached";

    }

    public House(int age , int cost){
        this.age = age;
        this.cost = cost;
        this.type = "Attached";
    }

    public House(int age , int cost, String type){
        this.age = age;
        this.cost = cost;
        this.type = type;
    }

    //create your getter methods
    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public int getCost() {
        return cost;
    }


    //Create the setter methods


    public void setAge(int age) {
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    

    

    //create your estimatePrice method
    public int estimatePrice(){
        int potential_cost = 0;
        if (this.type == "Attached"){
            potential_cost += 100000;

            for (int i = 1; i <= age; i++){
                if (i <= 5){
                    potential_cost += (0.01)*this.cost;
                }
                if (i  > 5){
                    potential_cost += (0.02)*this.cost;
                }
            }

        }
        if (this.type == "Semidetached"){
            potential_cost += 150000;

            for (int i = 1; i <= age; i++){
                if (i <= 5){
                    potential_cost += (0.02)*this.cost;
                }
                if (i  > 5){
                    potential_cost += (0.03)*this.cost;
                }
            }
        }

        if (this.type == "Detached"){
            potential_cost += 200000;

            for (int i = 1; i <= age; i++){
                if (i <= 5){
                    potential_cost += (0.02)*this.cost;
                }
                if (i  > 5){
                    potential_cost += (0.02)*this.cost;
                }
            }
        }

        return potential_cost;
    }


    //create the toString() method
    //to do this, right click -> generate -> toString
    public String toString(){
        return this.type + " " + this.age + " " +this.age;
    }


    //create the equals() method
    //to do this, right click -> generate -> override methods - > equals()
    public boolean equals(House object2){
        if (object2.type == this.type && object2.age == this.age){
            return true;
        }
        return false;
    }

    public boolean isLessThan(House object2){
        if (object2.cost > this.cost){
            return true;
        }
        return false;
    }

    public boolean isGreaterThan(House object2){
        if (object2.cost < this.cost){
            return true;
        }
        return false;
    }



    //create the isLessThan() method
    //this will be similar to how your equals method definition looks like



    //create the isGreaterThan() method
    //this will be similar to how your equals method definition looks like

}