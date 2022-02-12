package Java101;
import java.util.Arrays;
public class Example30 {
    static boolean isEven(int x){
        if ((x % 2) == 0){
            return true;
        }
        return false;
    }
    static boolean isFind(int[] array,int x){
        for (int i : array){
            if (i == x){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = {3,4,5,2,21,14,7,2,4,21};
        int[] duplicate = new int[array.length];
        int startIndex = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (isEven(array[i])){
                    if ((i != j) && array[i] == array[j]){
                        if (!isFind(duplicate,array[j])){
                            duplicate[startIndex++] = array[i];
                        }
                    }
                }
            }
        }

        for (int i : duplicate){
            if (i != 0){
                System.out.println(i);
            }
        }
    }
}
