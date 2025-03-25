import java.util.*;
import java.math.*;
import java.io.*;
public class slide_32 {
    public static void main(String[] args) {
        // exercise1(); 
        // exercise2(); 
        // exercise3(); 
        exercise4();
    }

    public static void exercise1(){
        Scanner input = new Scanner(System.in);
        System.out.print("width:");
        double width = input.nextDouble();
        System.out.print("height:");
        double height = input.nextDouble();

        System.out.println("Area is: " + width*height);
        System.out.println("Perimeter is: " + (2*width + 2*height));
    }

    public static void exercise2(){
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Course: ");
        String course = input.nextLine();

        System.out.print("age: ");
        String age = input.nextLine();

        System.out.println("Students' name is "+ name +
                            ", Student's course is "+course+
                            ", and student is "+age+" years old");


    }

    public static void exercise3(){
        Scanner input = new Scanner(System.in);

        System.out.print("number of sides: ");
        int num_sides = input.nextInt();

        System.out.print("length of each side: ");
        double length = input.nextDouble();

        double polygon_area = ((double) num_sides * length*length)/(4*Math.tan(Math.PI/num_sides));

        System.out.println("Area is "+polygon_area);
    }

    public static void exercise4(){
        Scanner input = new Scanner(System.in);
        System.out.print("Number to convert to binary: ");
        int number = input.nextInt();
        String binary = "";
        int temp_dig;

        int current_num = number;
        while (current_num > 0){
            temp_dig = current_num % 2;
            binary += temp_dig;
            current_num /= 2;
        }

        StringBuilder str = new StringBuilder();
        str.append(binary);
        str.reverse();

        System.out.println(str);

       // System.out.println("binary of " + number + " = " + binary);
    }
}