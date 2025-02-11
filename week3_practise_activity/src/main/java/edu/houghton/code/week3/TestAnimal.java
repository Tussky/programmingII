package edu.houghton.code.week3;

/**
 * Name : (Your name here)
 * Course: CSCI 218 - Programming II
 */

public class TestAnimal {
    public static void main(String[] args) {
        
        Animal snail = new Animal(3.5f, "snail", 1);
        snail.print();
        System.out.println("population: "+snail.getAnimalPopulation() + "alive: " + Animal.getAnimalsAlive());
    
        Animal bobcat = new Animal("bobcat");
        bobcat.print();

        System.out.println("population: "+bobcat.getAnimalPopulation() + "alive: " + Animal.getAnimalsAlive());
    
        bobcat.set_mass(3.2f);

        Animal bear = new Animal(3498.23f, "bear", 4);

        Animal babyAnimal1, babyAnimal2;
        babyAnimal1 = Animal.reproduce(bear);
        babyAnimal2 = Animal.reproduce(bobcat);

        snail.die();

        babyAnimal1.setAnimalPopulation(500);;
        bobcat.die();
        babyAnimal1.die();
        babyAnimal2.die();
        bear.die();
        Animal.getAnimalsAlive();
    }

}
