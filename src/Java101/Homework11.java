package Java101;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Homework11 {
    static int pow(int base,int exponent) {
      if (exponent == 0) {
          return 1;
      }
      return  base * pow(base,exponent-1);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int base,exponent;
        System.out.print("Enter the base that used for power calculation ==> ");
        base = inp.nextInt();
        System.out.print("Enter the exponent that used for power calculation ==> ");
        exponent = inp.nextInt();
        int result = pow(base,exponent);
        System.out.print("Result is ==> "+result);
    }
}
