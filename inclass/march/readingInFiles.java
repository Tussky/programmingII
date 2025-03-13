package march;
import java.io.*;
import java.util.Scanner;

public class readingInFiles{
    public static void main(String[] args) {
        System.out.println("Current working directory: " + System.getProperty("user.dir"));
        File file = new File("helloWorld.txt");

        try{
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}