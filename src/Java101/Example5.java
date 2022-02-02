package Java101;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int entranceFee = 10,minFee = 20;
        double per_km = 2.20;
        double km = inp.nextDouble();
        double price = entranceFee + km * per_km;
        if(price<minFee){
            price = minFee;
        }
        System.out.println("Prace is that you must pay to taxi driver is "+price);
    }
}
