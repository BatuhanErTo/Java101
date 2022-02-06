package Java101;
import java.util.Scanner;
public class Homework10 {
    public static void main(String[] args) {
        int n1=0,n2=1;
        Scanner inp = new Scanner(System.in);
        System.out.print("How many Fibonacci numbers will be calculated: ");
        int n = inp.nextInt();
        int i = 1;
        while(i<=n){
            System.out.print(n1+"-");
            int sum = n1+n2;
            n1 = n2;
            n2 = sum;
            i++;
        }
    }
}
