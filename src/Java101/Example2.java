package Java101;

import  java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double fee = inp.nextInt();
        int vat = 18;
        if(fee>1000){
            vat = 8;
        }
        double result1 = fee % vat;
        double result2 = fee + result1;
        System.out.println(result1+" "+result2);
    }
}
