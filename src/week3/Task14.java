package week3;
//14. Print all integer powers of two not exceeding N in ascending order.Input N from console. Example ` Input 50(You can not use Math.pow())
//        Output ` 1 2 4 8 16 32.
import java.util.Scanner;

public class Task14 {

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter num: ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.print("Enter num: ");
                while (i <= n) {
                    System.out.print(i + " ");
                    i *= 2;
                }
            }
        }
    }