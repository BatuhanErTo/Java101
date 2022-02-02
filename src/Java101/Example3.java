package Java101;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int side1,side2;
        side1 = inp.nextInt();
        side2 = inp.nextInt();
        double hypotenuse = Math.sqrt(side1*side1 + side2*side2);
        System.out.println("Hyptoneuse of the triangle is "+hypotenuse);

    }
}

