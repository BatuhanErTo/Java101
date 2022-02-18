package MayınTarlası;
import java.util.Scanner;
public class MineSweeper {
    int row;
    int column;
    int userRow;
    int userColumn;
    int[][] map;
    String[][] board;
    boolean isLost;
    MineSweeper(int row,int column){
        this.row = row;
        this.column = column;
        this.map = new int[row][column];
        this.board = new String[row][column];
    }
    //********YAPILDI************//
    public void userPrompt(){
        Scanner scan = new Scanner(System.in);
        do{
            System.out.print("Satır giriniz ==> ");
            this.userRow = scan.nextInt();
            System.out.print("Sütun giriniz ==> ");
            this.userColumn = scan.nextInt();
        }while (this.userRow<0 || this.userRow>this.row || this.userColumn<0 || this.userColumn>this.column);
    }
    public void setMap(){
        int quantityOfBomb = (this.row * this.column) / 4;
        int count = 0;
        int mineRow,mineColumn;
        while (count < quantityOfBomb){
            mineRow = (int) (Math.random()*this.row);
            mineColumn = (int) (Math.random()*this.column);
            if (this.map[mineRow][mineColumn] != 1){
                this.map[mineRow][mineColumn] = 1;
                count++;
            }
        }
    }
    public void setBoard(){
        for (int i = 0; i < this.row; i++){
            for (int j = 0; j < this.column; j++) this.board[i][j] = " - ";
        }
    }
    public void printMap(){
        for (int[] rows : this.map) {
            for (int columns : rows) {
                if (columns == 1){
                    System.out.print(" * ");
                }else {
                    System.out.print(" - ");
                }

            }
            System.out.println(" ");
        }
    }
    public void printBoard(){
        for (String[] strings : this.board) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println(" ");
        }
    }
    public void select(int i,int j){
        int count = 0;
        this.isLost = false;
        if (this.map[i][j] == 1){
            this.isLost = true;
            System.out.println("-------------GAME OVER----------------------");
        }else{
            for (int l = i-1; l <= i+1; l++){
                for (int k = j-1; k <= j+1; k++){
                    if (l == i && k == j){
                        continue;
                    }
                    try {
                        count += this.map[l][k];
                    }catch (Exception ignored){}
                }
            }
        }
        this.board[i][j] = String.valueOf(count);
    }
    public boolean isWin(int count){
        int quantityOfBomb = (this.row * this.column) / 4;
        int sum = this.row + this.column;
        return count == (sum - quantityOfBomb);
    }
    public void run(){
        setMap();
        setBoard();
        System.out.println("=============== MAP ====================");
        printMap();
        System.out.println("=============== BOARD ====================");
        printBoard();
        int count = 0;
        while (!isLost){
            userPrompt();
            select(this.userRow,this.userColumn);
            count++;
            printBoard();
            if (isWin(count)){
                System.out.println("---------------------WE ARE THE CHAMPIONS--------------------------");
                break;
            }
        }
    }



}
