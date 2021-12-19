package week2;

// 29. GNCHE-1" is a complex electronic device
//      that issues every second the next sequence
//      number 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5 ...
//      Due to the high cost of electronic components,
//      you have been instructed to develop an emulator
//      for these devices. The number of seconds (from 1 to 1,000,000)
//      is given that the generator works after being turned on.

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range of number(1.000.000,00)");
        int limit = input.nextInt();
        int count = 0;
        boolean stop = false;
        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= i; j++) {
                if (count == limit) {
                    stop = true;
                    break;
                }
                count++;
                System.out.print(i + " ");
            }
        }
    }
}