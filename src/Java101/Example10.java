package Java101;

import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the heat");
        int heat = inp.nextInt();
        if(heat<5){
            System.out.println("Snowboarding");
        }else if(heat<25){
            if(heat<15){
                System.out.println("Theatre");
            }else{
                System.out.println("Picnic");
            }
        }else{
            System.out.println("Swimming");
        }
    }
}
