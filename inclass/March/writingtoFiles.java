package March;
import java.io.*;

public class writingtoFiles{
    public static void main(String[] args) {
        try{
            PrintWriter out = new PrintWriter(new FileWriter("out.txt"));
            String name = "Bob Dylan";
            double score = 999.4;
            out.print(name);
            out.print(" ");
            out.println(score);
            out.close();
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }
}