package Java101;
import java.util.Scanner;
public class Example25 {
    static int fibonacci(int number) {
        if (number==1 || number==2) {
            return 1;
        }
        return fibonacci(number-1) + fibonacci(number-2);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Which index of fibonacci numbers will be calculated ==> ");
        int x = inp.nextInt();
        System.out.println(fibonacci(x));
    }
}
