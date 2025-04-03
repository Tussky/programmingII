package foo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.lang.reflect.Array;

public class Quiz {
    private int score;
    private int attempted;
    private ArrayList<Question> questions;
    private boolean continueQuiz;
    private String questionDir;

    // if reading in a from a file.
    public Quiz(String dir) {
        this.questionDir = dir;
        this.score = 0;
        this.questions = new ArrayList<Question>();
    }

    // if adding in questions manually.
    public Quiz() {
        this.score = 0;
        this.questionDir = null;
    }

    public void setQuestionsLoc(String dir){
        this.questionDir = dir;
    }

    public void addQuestion(String question, String answer, ArrayList<String> options){
        Question toAdd = new Question(question, answer, options);
        questions.add(toAdd);
    }

    public void getQuestions(){
        try{
            File questionFile = new File(this.questionDir);
            Scanner scanner = new Scanner(questionFile);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                ArrayList<String> temp = new ArrayList<String>(Arrays.asList(line.split(", ")));

                ArrayList<String> tempOptions = new ArrayList<String>(Arrays.asList(temp.get(1), temp.get(2), temp.get(3), temp.get(4)));
                Question question = new Question(temp.get(0), temp.get(-1), tempOptions);
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
        int counter = 0;

        while(this.continueQuiz){
            this.attempted++;
            Question iterQuestion = this.questions.get(counter);
            System.out.println(iterQuestion.getQuestion());
            System.out.println("Your options are:" + iterQuestion.getOptions());

            String response = String.valueOf(input.nextLine());
            System.out.println(iterQuestion.validateAnswer(response));

            if (iterQuestion.validateAnswer(response)){
                this.score++;
            }
            
            if (counter == this.questions.size()-1){
                continueQuiz = false;
                this.score();
            }
            else {
                counter++;
            }
        }
        input.close();
    }

    public void score(){
        System.out.println("Final Score: " + Math.floor((double)this.score/this.attempted*100) + "%");
    }
}
