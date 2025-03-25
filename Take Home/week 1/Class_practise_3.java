 import java.util.*;
import static java.lang.Math.*;
public class Class_practise_3 {
    public static void main(String[] args) {
        // task1();
        // task2();
        // task3();
        // task4();
        // task5();
        
        task7();
    }
        public static void task1(){
            Scanner input = new Scanner(System.in);
            System.out.print("$");
            double celsius = input.nextDouble();

            double fahreneheit = (double) 9/5 * celsius + 32;
            System.out.println("Fahreneheit:"+fahreneheit);
        }

        public static void task2(){
            System.out.println();
            System.out.println("--- TASK 2 ---");
            Scanner input = new Scanner(System.in);

            System.out.print("length $");
            double length = input.nextDouble();

            System.out.print("radius $");
            double radius = input.nextDouble();

            double area = radius * radius * Math.PI;
            System.out.println("Area is "+ area);

            double volume = area * length;
            System.out.println("Volume is "+ volume);
        }

        public static void task3(){
            System.out.println();
            System.out.println("--- TASK 3 ---");
            Scanner input = new Scanner(System.in);

            double feet = input.nextDouble();

            double meters = feet * 0.305;
            System.out.println("Meters: "+meters);
        }

        public static void task4(){
            // (Convert pounds into kilograms) Write a program that converts pounds into kilograms. 
            // The program prompts the user to enter a number in pounds, converts it to kilograms,
            //  and displays the result. One pound is 0.454 kilograms.
            System.out.println("--- TASK 4 ---");
            Scanner input = new Scanner(System.in);
            
            double pounds = input.nextDouble();
            System.out.println("Kilograms: "+(pounds*0.454));

        }

        public static void task5(){
            // (Financial application: calculate tips) Write a program that reads the subtotal and the gratuity rate,
            // then computes the gratuity and total. For example, if the user enters 10 for subtotal 
            //and 15% for gratuity rate, the program displays $1.5 as gratuity and $11.5 as total.
            System.out.println("--- TASK 5 ---");
            Scanner input = new Scanner(System.in);

            System.out.print("gratuity(%):");
            double subtotal = input.nextDouble();
            System.out.print("total:");
            double gratuity = (input.nextDouble())/100;

            System.out.println("gratuity: "+(subtotal*gratuity));
            System.out.println("total: "+(subtotal+subtotal*gratuity));
        }

        public static void task6(){
            Scanner input = new Scanner(System.in);

            System.out.print("Pick an integer between 1 & 1000:");
            double number = input.nextDouble();
            int total = 0;
            while (number > 0){
                System.out.println(number % 10);
                total += number % 10;
                number = (int) number / 10;
            }

            System.out.println(total);
        }

        public static void task7(){
            System.out.println("--- Task 3 ---");
            System.out.print("total number of minutes: ");

            Scanner input = new Scanner(System.in);
            double total_mins = input.nextDouble();

            int num_years = (int) total_mins / 525_600;
            int rem_mins = (int) total_mins % 525_600;
            int num_days = (int) rem_mins / 1_440;
            

            System.out.println((int) total_mins + " minutes is approximately "+ num_years +" years and "+num_days+" days.");
        }
}


