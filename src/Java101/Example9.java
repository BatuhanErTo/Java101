package Java101;

import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double math,physic,chemistry,english,music,average;
        int tracker = 5;
        System.out.println("Please enter the grades of the following lessons");
        System.out.println("Math =");math= inp.nextDouble();if(math<0 || math>100)tracker--;math=0;
        System.out.println("Physic =");physic= inp.nextDouble();if(physic<0 || physic>100)tracker--;physic=0;
        System.out.println("Chemistry =");chemistry= inp.nextDouble();if(chemistry<0 || chemistry>100)tracker--;chemistry=0;
        System.out.println("English =");english= inp.nextDouble();if(english<0 || english>100)tracker--;english=0;
        System.out.println("Music =");music= inp.nextDouble();if(music<0 || music>100)tracker--;music=0;
        average = (math+chemistry+physic+music+english)/tracker;
        System.out.println(physic);
        if(average<55){
            System.out.println("You failed because of your total grade is less than 55");
        }else{
            System.out.println("Congrats you passed the gradeee....");
        }

    }
}
