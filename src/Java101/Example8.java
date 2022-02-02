import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName,password,choice;
        System.out.println("Enter your user name");
        userName = inp.nextLine();
        System.out.println("Enter your password");
        password = inp.nextLine();
        if(userName.equals("patika") && password.equals("java101")){
            System.out.println("Valid login");
        }else if(!userName.equals("patika")){
            System.out.println("Invalid user name");
        }else{
            System.out.println("Invalid password or password and username");
            System.out.println("Would you like to change your password : Y/N");choice= inp.nextLine();
            switch (choice){
                case "Y" :
                    System.out.println("Enter your new password and remember your new password cannot matched with your former password");
                    password = inp.nextLine();
                    if (password.equals("java101")){
                        System.out.println("Invalid password");
                    }else{

                        System.out.println("You have succesufully changed your password.Your new password is "+password);
                    }break;
                case "N" :
                    System.out.println("Why are you wasting my time then");break;
                default:
                    System.out.println("Invalid choice you should enter yes or no ");
            }

        }

    }
}
