package selfTest;

import java.util.Scanner;

/******Nested Ifs*****/

public class SelfScoring {

    public static void main(String args[]){

        /*Get known variables*/
        System.out.println("Please Enter your score here:");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();

        //Determine the letter grade
        char grade;

        if(score < 50){
            grade = 'F';
        }
        else if(score < 60){
            grade = 'E';
        }
        else if(score < 70){
            grade = 'D';
        }
        else if(score < 80) {
            grade = 'C';
        }
        else if(score < 90){
            grade = 'B';
        }
        else {
            grade = 'A';
        }

        System.out.println("Your grade is "+ grade);

    }
}
