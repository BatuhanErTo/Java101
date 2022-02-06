package Java101;
import java.util.Scanner;
public class Example24 {
    static boolean isTrue(int number) {
        int temp = number;
        int reverseNumber = 0,lastNumber;
        while (temp!=0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp = temp / 10;
        }
        if (number == reverseNumber) {
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number ==> ");
        int number = inp.nextInt();
        boolean k = isTrue(number);
        if (k == true) {
            System.out.println("Given number is a palindrome");
        }else {
            System.out.println("Given number is not a palindrome");
        }
    }
}
