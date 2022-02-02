import java.awt.*;
import java.util.Scanner;
public class Homework2 {
    public static void main(String[] args) {
        double pears = 2.14,apples = 3.67,tomatos = 1.11,bananas = 0.95,eggplants = 5.00,kg;
        double ppears,papples,ptomatos,pbananas,peggplants,sum;
        Scanner inp = new Scanner(System.in);
        System.out.println("How many kilograms of pears");
        kg = inp.nextDouble();
        ppears = kg * pears;
        System.out.println("How many kilograms of apples");
        kg = inp.nextDouble();
        papples = kg * apples;
        System.out.println("How many kilograms of tomatos");
        kg = inp.nextDouble();
        ptomatos = kg * tomatos;
        System.out.println("How many kilograms of bananas");
        kg = inp.nextDouble();
        pbananas = kg * bananas;
        System.out.println("How many kilograms of eggplants");
        kg = inp.nextDouble();
        peggplants = kg * eggplants;
        sum = papples+pbananas+pears+peggplants+ppears+ptomatos;
        System.out.println("Total fee : "+sum);
    }
}

