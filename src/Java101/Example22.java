package Java101;
import java.util.Scanner;
public class Example22 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the n1 : ");
        int n1 = inp.nextInt();
        System.out.println("Enter the n2 : ");
        int n2 = inp.nextInt();
        int lnumber = Math.min(n1, n2);
        while (lnumber>=1) {
            if (n1%lnumber==0 && n2%lnumber==0) {
                System.out.println(lnumber);
                break;
            }
            lnumber--;
        }
        int i = 1;
        while (i<=n1*n2) {
            if (i%n1==0 && i%n2==0) {
                System.out.println(i);
                break;
            }else {
                i++;
            }

        }
    }
}
