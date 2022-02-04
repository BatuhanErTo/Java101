package Java101;
import java.util.Scanner;
public class Homework8 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("How much rows does your pyramid need to consist of : ");
        int row = inp.nextInt();
        int a = 0;
        for (int i=row;i>=1;i--) {
            for (int j=0;j<=a;j++) {
                System.out.print(" ");
            }
            a++;
            for (int k=((2*i)-1);k>=1;k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
