public class NewTestZoo{
    public static void main(String[] args) {
        Zoo myZoo = new Zoo();

        Animal spider = new Animal(3.5f, "spider", 8);
        Animal elephant = new Animal(50000, "elephant", 4);
        Animal snake = new Animal(20, "snake", 0);
        
        myZoo.addAnimal(spider);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(snake);
    }
}