package Febuary.Animal_structure;

public class cat extends feline {
    @Override
    public void makeNoise() {
        System.out.println("Meooow Meoooow");
    }

    @Override
    public void eat() {
        System.out.println("eating biscuits and milk");
    }
}
