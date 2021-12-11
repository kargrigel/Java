package week3;

import java.util.Scanner;


//13.The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on the following rules:
//        -if the average score >= 80%                 =>grade=A
//        -if the average score >= 60% and <80% => grade=B
//        -if the average score>=40% and < 60% =>grade=C
//        -else.   =>grade=F
public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first score: ");
        float quiz = sc.nextFloat();
        if (quiz<0 || quiz>100){
            System.out.println("Enter score at 0-100: ");
            System.exit(0);

        }
        System.out.println("Enter second score: ");
        float midTerm = sc.nextFloat();
        if (midTerm<0 || midTerm>100){
            System.out.println("Enter score at 0-100: ");
            System.exit(0);
        }
        System.out.println("Enter final score: ");
        float finalScore = sc.nextFloat();
        if (finalScore<0 || finalScore>100){
            System.out.println("Enter score at 0-100: ");
            System.exit(0);
        }
        float score = (quiz+midTerm+finalScore)/3;
            if (score>=80){
                System.out.println("Final score: A");
            }else if (score>=60){
                System.out.println("Final score: B");
        }else if (score>=40){
                System.out.println("Final score: C");
            }else {
                System.out.println("Final score: F");
            }




    }
}