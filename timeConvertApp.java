package TIMECONVERTAPP;
import java.util.Scanner;

public class timeConvertApp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int newHour, newMinute, newSecond;
        String AmPmCheck;
        boolean newMeridian = true;
        System.out.println("Please input your hour: ");
        newHour = scanner.nextInt();
        System.out.println("Please input your minutes: ");
        newMinute = scanner.nextInt();
        System.out.println("Please input your seconds: ");
        newSecond = scanner.nextInt();
        System.out.println("Is it AM or PM?(Please Observe CAPSLOCK) ");
        AmPmCheck = scanner.nextLine();
        if(AmPmCheck == "AM"){
            newMeridian = false;
        }else if(AmPmCheck == "PM"){
            newMeridian = true;
        }else {
            System.out.println("You didnt follow proper instructions!/nPlease Try Again from the start");
            System.exit(1);
        }
        timeDetails time = new timeDetails(newHour, newMinute, newSecond, newMeridian);
        scanner.close();
    }
}