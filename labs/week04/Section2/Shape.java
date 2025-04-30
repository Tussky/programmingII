package Section2;

public class Shape {
    public String name; 
    public String color; 

    // Constructors
    public Shape(){
        this.name = "UNKNOWN";
        this.color = "black";
    }

    public Shape(String name, String color){
        this.name = name;
        this.color = color;
    }

    // Methods
    public int getArea(){
        return 0;
    }

    public void displayInfo(){
        System.out.println("Shape's Name: " + this.name);
        System.out.println("Shape's Color: "+ this.color);
        System.out.println("Shape's Area: " + this.getArea());
    }
}
