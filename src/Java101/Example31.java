package Java101;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Example31 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int random = rand.nextInt(100);
        int right = 0,selected;
        boolean isError = false;
        boolean isTrue = false;
        int[] mistakes = new int[5];
        System.out.println(random);
        while (right < 5){
            System.out.print("Enter your guess ==>");
            selected = scan.nextInt();
            if (selected < 0 || selected > 100){
                System.out.println("Number must be between 0-100");
                if (!isError){
                    System.out.println("You are gonna loose your try chances if you make a mistake one more time KAREN !!!!");
                    isError = true;
                }else{
                    right++;
                    System.out.println("Chances : "+(5-right));
                }
                continue;
            }
            if (selected == random){
                isTrue = true;
                break;
            }else{
                mistakes[right] = selected;
                right++;
                System.out.println("Wrong choice");
                if (selected < random){
                    System.out.println("Your choice is lesser");
                }else{
                    System.out.println("Your choice is bigger");
                }
                System.out.println("You have "+(5-right)+" right to try");
            }
        }
        if(!isTrue){
            System.out.println("Looser");
            System.out.println("Your choices are + "+ Arrays.toString(mistakes));
        }else{
            System.out.println("You win mate");
        }
    }
}
