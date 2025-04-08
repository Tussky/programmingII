package Animal;
public class NewTestZoo{
    public static void main(String[] args) {
        Zoo myZoo = new Zoo();

        Animal spider = new Animal(3.5f, "spider", 8);
        Animal spider1 = new Animal(3.5f, "spider", 8);

        // System.out.println(spider.equals(spider1));

        Animal elephant = new Animal(50000, "elephant", 4);
        Animal animal_dad = new Animal("gorilla");
        Animal animal_mum = new Animal("gorilla");
        Animal animal3 = new Animal("animal3");
        Animal animal4 = new Animal("animal4");
        Animal animal5 = new Animal("animal5");
        Animal animal6 = new Animal("animal6");
        Animal animal7 = new Animal("animal7");
        Animal animal8 = new Animal("animal8");
        Animal animal9 = new Animal("animal9");
        Animal animal10 = new Animal("animal10");

        
        myZoo.addAnimal(spider);
        myZoo.addAnimal(spider1);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(animal_mum);
        myZoo.addAnimal(animal_dad);
        myZoo.addAnimal(animal3);
        myZoo.addAnimal(animal4);
        myZoo.addAnimal(animal5);
        myZoo.addAnimal(animal6);
        myZoo.addAnimal(animal7);
        myZoo.addAnimal(animal8);
        myZoo.addAnimal(animal10);
        myZoo.addAnimal(animal10);
        myZoo.addAnimal(animal10);

        myZoo.makeBaby();
    }
}