package MayınTarlası;
import java.util.Scanner;
public class MineSweeper {
    int row;
    int column;
    int userRow;
    int userColumn;
    String[][] map;
    String[][] board;
    MineSweeper(int row,int column){
        this.row = row;
        this.column = column;
        this.map = new String[row][column];
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
        int counter = 0;
        int mineRow,mineColumn;
        for (int i = 0; i < this.row; i++){
            for (int j = 0; j < this.column; j++) this.map[i][j] = " - ";
        }
        while (counter < quantityOfBomb){
            mineRow = (int) (Math.random() * this.row);
            mineColumn = (int) (Math.random() * this.column);
            this.map[mineRow][mineColumn] = " * ";
            counter++;
        }

    }
    public void setBoard(){
        for (int i = 0; i < this.row; i++){
            for (int j = 0; j < this.column; j++) this.board[i][j] = " - ";
        }
    }
    public void printMap(){
        for (String[] strings : this.map) {
            for (String string : strings) {
                System.out.print(string);
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
    public void run(){
        setMap();
        setBoard();
        System.out.println("=============== MAP ====================");
        printMap();
        System.out.println("=============== BOARD ====================");
        printBoard();
        for (int i = 0; i < this.row; i++){
            for (int j = 0; j < column; j++){
                userPrompt();
                if (this.map[userRow][userColumn].equals(" * ")){
                    System.out.println("GAME OVER");
                }
            }
        }
    }



}
