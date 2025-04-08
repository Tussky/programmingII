package labs.week_05_Lab_activity_1.Animal;
/**
 * Name : Isaac Anderson
 * Course: CSCI 218 - Programming II
 */
public class Animal {
    private float mass;
    private String name;
    private int legs;
    private boolean isAlive;
    private int counter;
    private static int animals_alive;

    public Animal(String name) {
        this.name = name;
        this.isAlive = true;
        
        this.counter++;
    }


    public Animal(float mass, String name, int legs) {
        this.mass = mass;
        this.name = name;
        this.legs = legs;

        this.isAlive = true;
        this.counter++;
    }



    public void set_mass(float mass){
        this.mass = mass;
    }

    public float getMass() {
        return mass;
    }

    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public int getAnimalPopulation(){
        return this.counter;
    }

    public static int getAnimalsAlive(){
        return Animal.animals_alive;
    }
    public static Animal reproduce(Animal parent){
        Animal baby = new Animal(parent.mass / 2, parent.name, parent.legs);
        return baby;
    }

    public void die(){
        Animal.animals_alive--;
    }

    public void setAnimalPopulation(int number){
        this.counter = number;
    }

    public void print(){
        System.out.printf("animal (name = " + this.name + ", mass=" +this.mass+", legs= "+this.legs+", status= "+this.isAlive+")");
        System.out.println("\n");
    }

    public boolean equals(Animal other){
        if (this.mass == other.mass && this.name.equals(other.name) && this.legs == other.legs && 
            this.isAlive == other.isAlive){
                return true;
        }
        else{
            return false;
        }
    }
}
