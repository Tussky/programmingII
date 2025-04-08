import java.util.Date;

public class Time{

    public static void main(String[] args) {
        while (true) {
            Date d = new Date();
            System.out.println(d.toString());

            try{
                Thread.sleep(1000);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}