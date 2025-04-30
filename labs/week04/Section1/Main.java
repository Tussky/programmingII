package Section1;
public class Main {
    public static void main(String[] args) {
        Dog rupert = new Dog("rupert",4);
        Animal bernie = new Animal("bernie", 10);

        bernie.speak();
        rupert.speak();

        // calling the overloaded function
        rupert.speak("AAAAAH");
        System.out.println("Dog age: " + rupert.getAge() + " | Dog Name: " + rupert.getName());
        System.out.println("Animal age: " + bernie.getAge() + " | Animal name: " + bernie.getName());
    }
}
