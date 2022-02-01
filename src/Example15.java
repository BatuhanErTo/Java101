import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Example15 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = inp.nextInt();
        for(int i=1;i<=number;i*=4){
            System.out.print(i+" ");
        }
        System.out.println("\n");
        for(int i=1;i<=number;i*=5){
            System.out.print(i+" ");
        }
    }
}
