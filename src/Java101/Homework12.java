package Java101;
import java.util.Scanner;
public class Homework12 {
    static int isPrime(int number,int a) {
        if (number<2) {
            return 0;
        }
        if (a==1) {
            return 1;
        }else {
            if (number%a == 0) {
                return 0;
            }else {
                return isPrime(number,a-1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number ==> ");
        int number = inp.nextInt();
        int a = number / 2;
        int result = isPrime(number,a);
        if (result == 0) {
            System.out.println("Given number is not a prime number");
        }else {
            System.out.println("Given number is a prime number");
        }
    }
}
