import java.util.Scanner;
public class Example11 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the first number");
        a = inp.nextInt();
        System.out.println("Enter the second number");
        b = inp.nextInt();
        System.out.println("Enter the third number");
        c = inp.nextInt();
        if(a>b && a>c){
            if(b>c){
                System.out.println("a>b>c");
            }else{
                System.out.println("a>c>b");
            }
        }else if(b>a && b>c){
            if(a>c){
                System.out.println("b>a>c");
            }else{
                System.out.println("b>c>a");
            }
        }else{
            if(b>a){
                System.out.println("c>b>a");
            }else{
                System.out.println("c>a>b");
            }
        }
    }
}
