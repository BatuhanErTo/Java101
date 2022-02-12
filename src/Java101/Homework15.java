package Java101;
import java.util.Arrays;
public class Homework15 {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] diplucate = new int[array.length];
        int counter;
        int startIndix = 0;
        for (int i = 0; i < array.length; i++){
            counter = 0;
            for (int j = 0; j < array.length; j++){
                if (array[i] == array[j]){
                    counter++;
                }
            }
            if(!isFind(diplucate,array[i])){
                diplucate[startIndix++] = array[i];
                System.out.println(array[i]+" : "+counter);
            }
        }
    }
    static boolean isFind(int[] arr,int x){
        for (int a : arr){
            if (a == x){
                return true;
            }
        }
        return false;
    }
}

