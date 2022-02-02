package Java101;

import java.util.Scanner;
public class Example18 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number,please --> ");
        int number = inp.nextInt();
        int tempnumber = number;
        int tracker=0,sum=0;
        while(tempnumber != 0){
            tempnumber=tempnumber /10;
            tracker++;
        }
        for (int i=1;i<=tracker;i++) {
            sum += number%10;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
