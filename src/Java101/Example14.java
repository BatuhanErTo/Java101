package Java101;

import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number,sum=0;
        do {
            number = inp.nextInt();
            if((number%2)==0){
                if((number%4)==0){
                    sum += number;
                }
            }
        }while((number%2)!=1);
        System.out.println(sum);
    }
}

