public class Zoo{
    private Animal[] cages;
    
    public Zoo(){
        cages = new Animal[10];
    }

    public boolean addAnimal(Animal new_animal){     
        int counter = 0;
        for (Animal animal : cages) {
            if (animal != null){
                counter++;
            }
        }   
        if (counter == cages.length) {
            Animal[] new_cages = new Animal[cages.length + (int) 0.5*cages.length];
            this.cages = new_cages;
        }
        for (int i = 0; i < cages.length; i++) {
            if (cages[i] == null){
                cages[i] = new_animal;
                
                System.out.println("The animal: "+new_animal.getName()+ " was placed in cage number: "+i);
                return true;
            }
        }
        return false;
    }


    public String toString(){
        String ret_str = "The content of the zoo is as follows...";
        for (int index = 0; index < cages.length; index++) {
            if (cages[index] == null){
                ret_str += "\nCage "+ index + " is empty";
            }
            else {
                ret_str += "\nCage "+ index +" has "+cages[index].getName()+".";
            }
        }
        return ret_str;
    }

    public void print(){
        System.out.println(this.toString());
    }

    public int numberOfAnimals(){
        int counter = 0;
        for (int i = 0; i < this.cages.length; i++) {
            if (this.cages != null){
                counter++;
            }
            else {
                break;
            }
        }
        return counter;
    }

    public float totalMass(){
        float subtotal_mass = 0;
        for (Animal animal : cages) {
            subtotal_mass += animal.getMass();
        }
        return subtotal_mass;
    }

    public int totalLegs(){
        int subtotal_mass = 0;
        for (Animal animal : cages) {
            subtotal_mass += animal.getLegs();
        }
        return subtotal_mass;
    }

    public void remove(Animal toRemove){
        for (int i = 0; i < this.cages.length; i++) {
            if (this.cages[i] != null && cages[i].equals(toRemove)){
                cages[i] = null;
                System.out.println("Animal was removed.");
                return;
            }
        }
        System.out.println("Animal was not in cages!");
        return;
    }

    public void reorder(){
        Animal[] new_cages = new Animal[cages.length];
        int index=0;
        for(Animal animal : cages){
            if (animal != null){
                new_cages[index++] = animal;
            }
        }
        cages = new_cages;
    }

    public void makeBaby(){
        for (int i = 0; i < cages.length; i++ ){
            for (int c = i+1; c < cages.length; c++){
                if (cages[i].getName().equals(cages[c].getName())){
                    Animal parent1 = cages[i];
                    Animal parent2 = cages[c];

                    float parents_mass = parent1.getMass() + parent2.getMass();
                    float avg_mass = parents_mass / 2;
                    float baby_mass = (float)(0.10)*avg_mass;
                    Animal baby = new Animal(baby_mass, parent1.getName(), parent1.getLegs());
                    this.addAnimal(baby);
                }
            }
        }
    }
}