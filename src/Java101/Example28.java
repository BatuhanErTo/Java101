package Java101;
import java.util.Scanner;
import java.util.Arrays;
public class Example28 {
    public static void main(String[] args) {
        int[] numbers = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(numbers);
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number ===> ");
        int num = inp.nextInt();
        int temp=0;
        for (int i=0;i<numbers.length;i++){
            if (num>numbers[i]&&num<numbers[i+1]){
                System.out.println("========================================================");
                System.out.println("The closest biggest number to given number is " + numbers[i+1]);
                System.out.println("The closest smallest number to given number is " + numbers[i]);
            }
        }

    }
}
