package week3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A : ");
        int a = scanner.nextInt();
        System.out.println("Enter B : ");
        int b = scanner.nextInt();
        // task 1
            /*if (a>10 && b!=10) {
                System.out.println("Both A and B legal");
        }
            else  if (a<10 && b!=10){
                System.out.println("B is legal A is ilegal");
            }
            else  if (a>10 && b==10){
                System.out.println("A is legal B is ilegal");
            }
            else {
                System.out.println("Both A and B ilegal");
            }*/
        // task 2
        /*if (a>0 && b>0){
            System.out.println("Both A and B legal");
        }else if(a<0 && b>0){
            System.out.println("B is legal A is ilegal");
        }else if (a>0 && b<0){
            System.out.println("A is legal B is ilegal");
        }else {
            System.out.println("Both A and B ilegal");
        }*/
        // task 5
        if (a % 5 == 0 || b % 5==0 ){
            System.out.println("True ");
        }else {
            System.out.println("False");
        }

    }
}
