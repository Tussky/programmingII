import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        String new_string = "";
        
        for (int i = input.length()-1; i >= 0; i--) {
            new_string += input.charAt(i);
        }

        System.out.println(new_string);
        
    }
}
