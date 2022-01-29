import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        System.out.println();
        Scanner inp = new Scanner(System.in);
        int math,physic,chemistry,history,music,english;
        math = inp.nextInt();
        physic = inp.nextInt();
        chemistry = inp.nextInt();
        history = inp.nextInt();
        music = inp.nextInt();
        english = inp.nextInt();
        int sum = math + physic + chemistry + music + history + english;
        double average = sum / 6;
        System.out.println(average);
        boolean a = average > 60;
        System.out.println(a);
    }
}
