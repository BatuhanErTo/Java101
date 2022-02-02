package Java101;

import java.util.Scanner;
public class Homework4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter your birth year : ");
        int year = inp.nextInt();
        int remainder = year % 12;
        switch (remainder){
            case 0:
                System.out.println("MONKEY");break;
            case 1:
                System.out.println("ROOSTER");break;
            case 2:
                System.out.println("DOG");break;
            case 3:
                System.out.println("PIG");break;
            case 4:
                System.out.println("RAT");break;
            case 5:
                System.out.println("OX");break;
            case 6:
                System.out.println("TIGER");break;
            case 7:
                System.out.println("RABBIT");break;
            case 8:
                System.out.println("DRAGON");break;
            case 9:
                System.out.println("SNAKE");break;
            case 10:
                System.out.println("HORSE");break;
            case 11:
                System.out.println("GOAT");break;
            default:
                System.out.println("Nope");
        }
    }
}
