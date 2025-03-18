import java.util.*;
public class ArrayDemoDriver{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many students score do you want to enter in?");
        int number_of_students = in.nextInt();

        int[] SCORES = new int[number_of_students];

        for( int i = 0; i < number_of_students; i++){
            System.out.println("Enter score for student " + i);
            SCORES[i] = in.nextInt();
        }

        System.out.println("Students scores successfully entered.");

        // for (int i : SCORES) {
        //     System.out.println(i);
        // }

        System.out.println("Max score is:" + arrayFuncs.maxArr(SCORES));
        System.out.println("Min score is:" + arrayFuncs.minArr(SCORES));
        System.out.println("Sum of scores is:" + arrayFuncs.sumArr(SCORES));
        System.out.println("Average score is:" + arrayFuncs.avgArr(SCORES));
    }
}