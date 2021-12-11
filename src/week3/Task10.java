package week3;

import java.util.Scanner;

//10.  Given 3 real numbers a , b , c .FInd all decisions for
//        ax2 + bx + c = 0.Print all decisions, if there is not a decision ,print “Can't be”.
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("give number for a: ");
        double a = sc.nextDouble();
        System.out.println("give number for b: ");
        double b = sc.nextDouble();
        System.out.println("give number for c: ");
        double c = sc.nextDouble();
        double D;

        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println(" x = " + x);
        }else {
            System.out.println("Can`t be");
        }
    }
}