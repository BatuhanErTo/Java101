import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        int side1,side2,side3;
        Scanner inp = new Scanner(System.in);
        side1 = inp.nextInt();
        side2 = inp.nextInt();
        side3 = inp.nextInt();
        int u = (side1+side2+side3)/2;
        int perimeter = u * 2;
        double area =  Math.sqrt(u * (u-side1) * (u-side2) * (u-side3));
        System.out.println("Perimeter of the triangle is "+perimeter+" and are of the triangle is "+area);
    }
}
