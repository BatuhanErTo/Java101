import java.util.Scanner;
public class Homework5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("What year were you born ? --> ");
        int year = inp.nextInt();
        if((year % 4)== 0){
            System.out.println(""+year+" is a leap year");
        }else if((year % 100)==0){
            if((year % 400)==0){
                System.out.println(""+year+" is a leap year");
            }else {
                System.out.println(""+year+" is not a leap year");
            }
        }else {
            System.out.println(""+year+" is not a leap year");
        }


    }
}
