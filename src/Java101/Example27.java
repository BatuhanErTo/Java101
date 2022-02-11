package Java101;
public class Example27 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        double sum = 0.0;
        for (int number : numbers) {
            sum += 1.0 / number;
        }
        double harmonicAvarage = numbers.length / sum;
        System.out.println(harmonicAvarage);
    }
}
