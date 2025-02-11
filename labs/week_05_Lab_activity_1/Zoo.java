public class Zoo{
    private Animal[] cages;
    
    public Zoo(){
        cages = new Animal[10];
    }

    public boolean addAnimal(Animal new_animal){        
        for (int i = 0; i < cages.length; i++) {
            if (cages[i] == null){
                cages[i] = new_animal;
                
                System.out.println("The animal: "+new_animal.getName()+ " was placed in cage number: "+i);
                return true;
            }
        }
        System.out.println("The zoo is full!");
        return false;
    }


    public String toString(){
        String ret_str = "The content of the zoo is as follows...";
        for (int index = 0; index < cages.length; index++) {
            if (cages[index] == null){
                ret_str += "\nThe rest of the cages are empty";
                return ret_str;
            }
            ret_str += "\nThe animal in cage "+ index +" is "+cages[index].getName()+".";
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
}