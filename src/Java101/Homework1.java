package Java101;

import java.util.Scanner;
public class Homework1 {
    public static void main(String[] args) {
        double height, weight;
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter your height and weight (Height must be meter)");
        height = inp.nextDouble();
        weight = inp.nextDouble();
        double bodyMassIndex = weight / (height * height);
        System.out.println("Your boddy mass index is " + bodyMassIndex);
    }
}
