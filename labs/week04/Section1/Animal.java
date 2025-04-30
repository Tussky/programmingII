package Section1;
public class Animal {
    private String name;
    private int age;

    

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Animal(){
        this.name="Unknown";
        this.age=0;
    }
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    
    public void speak(){
        System.out.println("Animal makes a sound.");
    }

    public void speak(String sound){
        System.out.println("Animal makes sound: "+sound);
    }

}