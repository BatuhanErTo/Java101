package Java101;
import java.util.Scanner;
public class Homework13 {
    static int CHECK = 0;
    static void pattern(int n,int y) {
        System.out.print(n+",");
        if (CHECK==0 && n>0) {
            pattern(n-5,y);
       }else if (n<=0 || CHECK==1) {
            CHECK = 1;
            if(n<y) {
                pattern(n+5,y);
            }
        }

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        do {
            System.out.print("N number ==> " );
            n = inp.nextInt();
        }while(n<=0);
        pattern(n,n);
    }
}
