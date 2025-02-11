package edu.houghton.code.week3;

public class Student {

    //instance variable declaration
    String title;
    String firstname;
    String surname;
    Long id;
    int day;
    int month;
    int year;

    int assignment1;
    int assignment2;

    int weekly_practical;

    int final_exam;

    int final_score;

    String final_grade;

    //default Constructor
    public Student(){

    }

    //parametized Constructor
    public Student(Long id, String title, String firstname, String surname, int day, int month, int year) {
        this.title = title;
        this.firstname = firstname;
        this.surname = surname;
        this.id = id;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //reasonable number of getters/setters


    //prints the student’s information
    public void printInfo(){

    }

    /**
     * computes the final overall mark
     * The criterion for calculating the weighted average is as defined below: The two assignments together
     * count for a total of 40% (20% each) of the final grade, the practical work is worth 10%, and the final
     * exam is worth 50% of the final grade.
     */
    public void computeFinalScore(){

    }


    /**
     * Computes the final grade
     * A grade is to be awarded as follows: An overall mark of 80 or higher is an HD, an overall mark of 70 or
     * higher (but less than 80) is a D, an overall mark of 60 or higher (but less than 70) is a C, an overall mark
     * of 50 or higher (but less than 60) is a P, and an overall mark below 50 is an N.
     */
    public void computeFinalGrade(){
    }
}
