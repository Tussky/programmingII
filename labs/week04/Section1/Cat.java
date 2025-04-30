package Section1;
public class Cat extends Animal{
    // method overriding
    @Override
    public void speak(){
        System.out.println("Cat MEOWS");
    }

    // overloaded method
    public void speak(int intensity){
        System.out.println("Cat meows at volume: " + intensity);
    }
}
