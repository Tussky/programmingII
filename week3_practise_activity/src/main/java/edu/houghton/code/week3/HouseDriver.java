package edu.houghton.code.week3;

/**
 *  Name : (Your name here)
 *  Course: CSCI 218 - Programming II
 *
 *
 * Todo:
 * declare 4 house objects using 4 different constructors and output description of the 4 houses.
 *
 * Test your accessor methods.
 *
 * Calculate the estimated price of houses given type and age (include 1 attached and 1 detached)
 *
 * Test out all 5 mutator methods to modify the attributes of different House objects.
 *
 * Test methods toString(), equals() , isLessThan() and isGreaterThan() for different House objects.
 */
public class HouseDriver {

    public static void main(String[] args) {
        House ours = new House();
        House yours = new House(50000);
        House theirs = new House(50, 2309482);
        House everyones = new House(34, 9834534, "Semiattached");
        System.out.println(everyones.getAge());
        System.out.println(theirs.getType());
        System.out.println(ours.isLessThan(everyones));
    }
}
