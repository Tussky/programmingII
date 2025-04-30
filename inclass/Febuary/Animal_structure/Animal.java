package Febuary.Animal_structure;

public class Animal {
    public String picture;
    public String food;
    public String boundaries;
    public String location;

    public Animal(String food){
        this.food=food;
    }

    public void makeNoise(){
        System.out.println("unidentifiable noise");
    }

    public void eat(){
        System.out.println("eating something");
    }

    public void sleep(){
        System.out.println("animal is sleeping");
    }

    public void roam(){
        System.out.println("animal is roaming");
    }
}
