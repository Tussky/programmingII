public class Dog extends Animal {
    public Dog(String name, int age){
        super(name, age);
    }

    public void ParentSpeak() {
        super.speak();
    }

    @Override
    public void speak(){
        System.out.println("Dog Barks.");
    }
}
