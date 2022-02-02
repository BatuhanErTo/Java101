package Java101;

import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int radius = inp.nextInt();double pi = 3.14;double angle = inp.nextDouble();
        double perimeter = 2*pi*radius;
        double area = pi*radius*radius;
        double areaOfSlice = (pi*(radius*radius)*angle)/360;
        System.out.println("Area and perimeter of the circle is "+area+" "+perimeter);
        System.out.println("Area of the slice of the given angle of the circle is "+areaOfSlice);
    }
}
