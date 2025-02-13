public class testZoo {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo();

        Animal snail = new Animal(3.5f, "snail", 1);
        Animal elephant = new Animal(50000, "elephant", 4);
        
        myZoo.addAnimal(snail);
        myZoo.remove(elephant);

        boolean t = true;
        while (t == true) {
           t=myZoo.addAnimal(snail); 
           if (t==false){
            break;
           }
        }

        System.out.println(myZoo.numberOfAnimals());
    
    }
}
