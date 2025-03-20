import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.*;
import java.lang.reflect.Array;
import java.util.random.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
public class Quiz {
    private String user;
    private int score;
    private int attempted;
    private ArrayList<Question> questions;
    private boolean continueQuiz;
    private String questionDir;

    public Quiz(String name, String dir) {
        this.user = name;
        this.questionDir = dir;
        this.score = 0;
        this.questions = new ArrayList<Question>();

        this.getQuestions();
        this.beginQuiz();

    }

    public void setQuestionsLoc(String dir){
        this.questionDir = dir;
    }

    public void getQuestions(){
        try{
            File questionFile = new File(this.questionDir);
            Scanner scanner = new Scanner(questionFile);
            ArrayList<ArrayList<String>> questions = new ArrayList<ArrayList<String>>();
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                ArrayList<String> temp = new ArrayList<String>(Arrays.asList(line.split(", ")));

                ArrayList<String> tempOptions = new ArrayList<String>(Arrays.asList(temp.get(1), temp.get(2), temp.get(3), temp.get(4)));
                Question question = new Question(temp.getFirst(), temp.getLast(), tempOptions);
                this.questions.add(question);
            }
            scanner.close();
        } catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
       
    }

    public void beginQuiz() {
        this.continueQuiz = true;
        Scanner input = new Scanner(System.in);

        while(this.continueQuiz){
            Question iterQuestion = this.questions.get(0);
            System.out.println(iterQuestion.getQuestion());
            System.out.println("Your options are:" + iterQuestion.getOptions());

            String response = String.valueOf(input.nextLine());
            System.out.println(iterQuestion.validateAnswer(response));
            this.continueQuiz=false;
        }
        input.close();
    }
    public void endQuiz() {}
}
