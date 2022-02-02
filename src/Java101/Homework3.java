import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args) {
        double distance,price;int age,type;
        boolean isTrue = false;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter the distance : ");distance=inp.nextDouble();
        System.out.print("Please enter the age of the passenger : ");age= inp.nextInt();
        System.out.print("Please enter the type of your travel: 1-One direction 2-Round Trip ");type= inp.nextInt();
        if(distance<0){
            isTrue = true;
        }
        if(age<0){
            isTrue = true;
        }
        if(type!=1 && type!=2){
            isTrue=true;
        }
        price = distance * 0.10;
        if(age<24){
            if(age<12){
                price = price - (price * 0.50);
            }else {
                price = price - (price * 0.10);
            }
        }else if(age>65){
            price = price - (price * 0.30);
        }
        if(type == 2){
            price = (price - (price*0.20))*2;
        }
        if(isTrue){
            System.out.println("Invalid values");
        }else {
            System.out.println("Passenger must pay : "+price);
        }

    }
}
