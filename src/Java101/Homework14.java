package Java101;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class Homework14 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Size of the array ==> ");
        int n = inp.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements of the array ===========");
        for (int i = 0; i < array.length; i++){
            System.out.print((i+1)+". ==> ");
            array[i] = inp.nextInt();
            System.out.println("\n");
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
