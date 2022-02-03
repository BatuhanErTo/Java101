package Java101;
import java.util.Scanner;
public class Example21 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName,password;
        int right = 3;
        int balance = 3000;
        int select;
        while (right>0) {
            System.out.print("Please enter your user name : ");
            userName = inp.nextLine();
            System.out.print("Please enter your password : ");
            password = inp.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Welcome to MY bank...");
                System.out.println("Which service do you want to get");
                System.out.println("1-Deposit\n2-Withdraw\n3-Balance\n4-Exit");
                System.out.print("Select 1,2,3 or 4 : ");
                select = inp.nextInt();
                switch (select) {
                    case 1 -> {
                        System.out.print("How much money do you want to deposit : ");
                        int deposit = inp.nextInt();
                        balance += deposit;
                    }
                    case 2 -> {
                        System.out.print("How much money do you want to withdraw : ");
                        int withdraw = inp.nextInt();
                        if (withdraw > balance) {
                            System.out.println("Invalid transaction");
                        } else {
                            balance -= withdraw;
                        }
                    }
                    case 3 -> System.out.println("Balance : " + balance);
                    case 4 -> System.out.println("Have a nice day");
                    default -> System.out.println("Invalid transaction");
                }
                break;
            }else {
                System.out.println("Invalid entrance");
                right --;
                if (right == 0) {
                    System.out.println("Your account has been blocked due to your 3 invalid login");
                }else {
                    System.out.println(right+" right left to try");
                }
            }
        }
    }
}
