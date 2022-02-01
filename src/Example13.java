import java.util.Scanner;
public class Example13 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number --> ");
        int number = inp.nextInt();
        double tracker = 0,sum = 0;
        for(int i = 1;i<=number;i++){
            if((i%3)==0&&(i%4)==0){
                sum += i;
                tracker++;
            }
        }
        System.out.println(sum/tracker);
    }
}
