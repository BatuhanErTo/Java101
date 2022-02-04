package Java101;
import java.util.Scanner;
public class Example23 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("How many number do you want to enter : ");
        int x = inp.nextInt();
        int snumber=0,bnumber=0,number;
        int i=1;
        while(i<=x){
            System.out.println("Enter "+i+". number");
            number = inp.nextInt();
            if (i==1){
                snumber=number;
                bnumber=number;
            }
            else {
                if(number<snumber){
                    snumber=number;
                }
                if(number>bnumber){
                    bnumber=number;
                }
            }
            i++;
        }
        System.out.println("Biggest number is : "+bnumber+" Smallest number is : "+snumber);
    }
}
