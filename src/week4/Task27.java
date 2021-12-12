package week4;

import java.util.Scanner;

public class Task27 {

    public  static  int binaryToDecimal(String binary) {
        int length = binary.length();
        int decimal = 0;
        for (int i = length - 1; i >= 0; i--) {
            int numericValue = Character.getNumericValue(binary.charAt(i));
            decimal += numericValue * Math.pow(2, length-i-1);

        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.nextLine();
        System.out.println(binaryToDecimal(binary));

    }
}
