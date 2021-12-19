package Test;

import java.util.Scanner;

public class RemoveChar {
    public static  String removeX(String string){
        if (string.length()==0){
            return string;
        }
        if (string.charAt(0)!='X' && string.charAt(0)!='x'){
            return  string.charAt(0) + removeX(string.substring(1));
        }
        return removeX(string.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        removeX(string);
        System.out.println(removeX(string));
    }
}
