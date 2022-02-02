package Java101;

import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        double number1,number2,result = 0;
        int choice;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the following numbers;\n1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        choice = inp.nextInt();
        System.out.println("Enter the first number : ");number1= inp.nextDouble();
        System.out.println("Enter the second number : ");number2= inp.nextDouble();
        switch (choice){
            case 1 :
                System.out.println("Your choice is addition");
                result = number1 + number2;break;
            case 2 :
                System.out.println("Your choice is subtraction");
                result = number1 - number2;break;
            case 3 :
                System.out.println("Your choice is multiplication");
                result = number1 * number2;break;
            case 4 :
                System.out.println("Your choice is division");
                if (number2 == 0){
                    System.out.println("Denominator can not be zero");
                    break;
                }
                result = number1 / number2;break;
            default:
                System.out.println("Invalid choice");    
        }
        System.out.println(result);
    }
}
