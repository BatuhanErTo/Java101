package Java101;
import java.util.Scanner;
public class Example20 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please,enter a number ---> ");
        int number = inp.nextInt();
        for (int i=0;i<number;i++) {
            for (int j=0;j<(number-i);j++) {
                System.out.print(" ");
            }
            for (int k=0;k<(2*i+1);k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        int k = 1;
        for (int a = number-1;a>0;a--) {
            for (int b=0;b<=k;b++) {
                System.out.print(" ");
            }
            k++;
            for (int c = (2*a)-1;c>0;c--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
