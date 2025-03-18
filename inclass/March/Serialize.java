package March;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


public class Serialize {
    public static void main(String[] args) {
        Animal a = new Animal("snail");

        try {
            OutputStream os = new FileOutputStream("snail.gbs");
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(a);
            oos.close();
            System.out.println("object persisted");
        } catch(Exception e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
