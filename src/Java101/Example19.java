import java.sql.SQLOutput;
import java.util.Scanner;
public class Example19 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number --> ");
        int number = inp.nextInt();
        double sum = 0.0;
        for (double i=1;i<=number;i++) {
            sum += (1 / i);
        }
        System.out.println(sum);
    }
}
