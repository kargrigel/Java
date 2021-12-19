package week2;

//  33.    Write 4 programs (X = A, B, C, D) that prompts user
//      for the size (a non-negative integer in int); and prints
//      each of the patterns as shown: Enter the size: 4
//      * **** **** *
//      ** *** *** **
//      *** ** ** ***
//      **** * * ****
//      a) b) c) d)

public class Task33 {
    public static void main(String[] args) {
        int lines = 4;
        int i, j;
        for(i = 1; i <= lines; i++) {
            for(j = 1; j <= lines + 1; j++) {
                if(i == j) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("*");
                }
            }
            j--;
            System.out.print(" ");
            while(j >= 1) {
                if(i == j) {
                    System.out.print(" *");
                }
                else {
                    System.out.print("*");
                }
                j--;
            }
            System.out.println("");
        }
    }
}