import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Quiz {
    private String user;
    private int score;
    private int attempted;
    private ArrayList<Question> questions;
    private boolean continueQuiz;
    private String questionsFileLoc;

    public Quiz(String user) {
        this.user = user;
        this.score = 0;
    }

    public void setQuestionsLoc(String dir){
        this.questionsFileLoc = dir;
    }

    public void getQuestions(){
        try{
            File questionFile = new File("this.questionsFileLoc");
            Scanner scanner = new Scanner(questionFile);
            
            while(scanner.hasNextLine()){

            }
            scanner.close();
        } catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
       
    }

    public void holdQuiz() {
        // access file
        // read in questions

        while (continueQuiz){

        }
    }
    public void endQuiz() {}
}
