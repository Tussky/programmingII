/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapp;
import java.util.ArrayList;
/**
 *
 * @author isaac
 */
public class Question{
    private String prompt;
    private String answer;
    private ArrayList<String> options;
    //constructor
    public Question(String question, String answer, ArrayList<String> options) {
        this.prompt = question;
        this.answer = answer;
        this.options = options;
    }

    // getters
    public String getQuestion() {
        return prompt;
    }

    public String getAnswer() {
        return answer;
    }

    public ArrayList<String> getOptions() {
        return options;
    }
   


    // class methods
    public boolean validateAnswer(String attempt){
        if (this.answer.equals(attempt)){
            return true;
        }
        else {
            return false;
        }
    }
}
}
