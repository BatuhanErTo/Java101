package Java101;
import java.util.Scanner;
public class Homework7 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = inp.nextInt();
        int sum = 0;
        for(int i=1;i<=(number/2);i++){
            if (number%i==0) {
                sum += i;
            }
        }
        if (number == sum) {
            System.out.println("The number that you entered is a perfect number");
        }else {
            System.out.println("The number that you entered is not a perfect number");
        }
    }
}
