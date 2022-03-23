package JavaCodes.KKCC.FirstJavaCodes;

import java.util.Scanner;

//Take name as input and print a greeting message for that particular name.
public class GreetingMsgWIthName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String Name=sc.nextLine();
        System.out.println("Hello "+Name+" Welcome have a great time ahead :)");
    }
}
