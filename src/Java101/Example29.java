package Java101;
import java.util.Scanner;
public class Example29 {
    public static void main(String[] args) {
        String[][] array = new String[7][4];
        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array[i].length;j++){
                if (i == 0 || i == 3 || i == 6){
                    array[i][j] = "*";
                }else if(j == 0 || j == 3){
                    array[i][j] = "*";
                }else{
                    array[i][j] = " ";
                }
            }
        }
        for (String[] row : array){
            for (String column : row){
                System.out.print(column);
            }
            System.out.println(" ");
        }
    }
}
