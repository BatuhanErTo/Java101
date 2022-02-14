package Java101;

import java.util.Scanner;

public class Example32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (isPolindrome1(str))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");

    }
    static boolean isPolindrome(String str){
        int i = 0;
        int j = str.length() - 1;
        while (i < j){
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    static boolean isPolindrome1(String str){
        String newstr = "";
        for (int i = str.length()-1; i >= 0 ; i--){
            newstr += str.charAt(i);
        }
        if (str.equals(newstr))
            return  true;
        else
            return false;
    }
}
