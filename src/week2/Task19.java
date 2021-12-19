package week2;

import java.util.Scanner;

//19.Print all numbers on the segment from a to b that give the remainder of c when divided by d. If such numbers do not exist, then you do not need to display anything.
//        Example ` Input` Output`
//        a 2 2 4
//        b 5
//        c 0
//        d 2
//        i.e 2 divided to 2 reminder is 0, 4 divided to 2 reminder is 0
public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 4 numbers: ");
        System.out.println("Enter A: ");
        int a = sc.nextInt();
        System.out.println("Please enter B: ");
        int b = sc.nextInt();
        System.out.println("Please enter C: ");
        int c = sc.nextInt();
        System.out.println("Please enter D: ");
        int d = sc.nextInt();

        if (a>b){
            for (int i =b; i<a; i++){
                if (i%d==c){
                    System.out.println(i);
                }
            }
        }else {
            for (int i =a; i<b; i++){
                if (i%d==c){
                    System.out.println(i);
                }
            }
        }
    }
}
