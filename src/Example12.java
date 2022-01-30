import java.util.Scanner;
public class Example12 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter what month were you born : ");
        int month = inp.nextInt();
        System.out.println("Enter what day were you born : ");
        int day = inp.nextInt();
        String horoscope = null;
        boolean isTrue = false;
        if(month==1){
            if(day>=1 && day<=21){
                horoscope = "Capricorn";
            }else if(day>=22 && day>=31){
                horoscope = "Aquarius";
            }else{
               isTrue = true;
            }
        }else if(month==2){
            if(day>=1 && day<=19){
                horoscope = "Aquarius";
            }else if(day>=20 && day>=28){
                horoscope = "Pisces";
            }else{
                isTrue = true;
            }
        }else if(month==3){
            if(day>=1 && day<=20){
                horoscope = "Pisces";
            }else if(day>=21 && day>=31){
                horoscope = "Aries";
            }else{
                isTrue = true;
            }
        }else if(month==4){
            if(day>=1 && day<=20){
                horoscope = "Aries";
            }else if(day>=21 && day>=30){
                horoscope = "Taurus";
            }else{
                isTrue = true;
            }
        }else if(month==5){
            if(day>=1 && day<=21){
                horoscope = "Taurus";
            }else if(day>=22 && day>=31){
                horoscope = "Gemini";
            }else{
                isTrue = true;
            }
        }else if(month==6){
            if(day>=1 && day<=22){
                horoscope = "Gemini";
            }else if(day>=23 && day>=30){
                horoscope = "Cancer";
            }else{
                isTrue = true;
            }
        }else if(month==7){
            if(day>=1 && day<=22){
                horoscope = "Cancer";
            }else if(day>=23 && day>=31){
                horoscope = "Leo";
            }else{
                isTrue = true;
            }
        }else if(month==8){
            if(day>=1 && day<=22){
                horoscope = "Leo";
            }else if(day>=23 && day>=31){
                horoscope = "Virgo";
            }else{
                isTrue = true;
            }
        }else if(month==9){
            if(day>=1 && day<=22){
                horoscope = "Virgo";
            }else if(day>=23 && day>=30){
                horoscope = "Libra";
            }else{
                isTrue = true;
            }
        }else if(month==10){
            if(day>=1 && day<=22){
                horoscope = "Libra";
            }else if(day>=23 && day>=31){
                horoscope = "Scorpio";
            }else{
                isTrue = true;
            }
        }else if(month==11){
            if(day>=1 && day<=21){
                horoscope = "Scorpio";
            }else if(day>=22 && day>=30){
                horoscope = "Sagittarius";
            }else{
                isTrue = true;
            }
        }else if(month==12){
            if(day>=1 && day<=21){
                horoscope = "Sagittarius";
            }else if(day>=22 && day>=31){
                horoscope = "Capricorn";
            }else{
                isTrue = true;
            }
        }else{
            isTrue = true;
        }
        if(isTrue){
            System.out.println("Invalid values");
        }else{
            System.out.println("Your horoscope is "+horoscope);
        }
    }
}
