package Java101;

import java.util.Scanner;
public class Example17  {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int base,exponent,result = 1;
        System.out.print("Base --> ");
        base = inp.nextInt();
        System.out.print("Exponent--> ");
        exponent = inp.nextInt();
        for (int i=1;i<=exponent;i++) {
            result *= base;
        }
        System.out.println(result);
    }
}
