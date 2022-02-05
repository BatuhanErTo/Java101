package Java101;
public class Homework9 {
    public static void main(String[] args) {
        int isTrue;
        for (int i = 2;i<=100;i++){
            isTrue = 0;
            for (int j=2;j<i;j++) {
                if (i%j == 0) {
                    isTrue = 1;
                }
            }
            if (isTrue == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
