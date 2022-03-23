package JavaCodes.KKCC.FirstJavaCodes;

import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class SimpleInterstCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal Value:");
        long principal = sc.nextLong();
        System.out.println("Enter the time or period(in years):");
        int time = sc.nextInt();
        System.out.println("Enter the rate of interest(per annum):");
        float rate = sc.nextFloat();
        float interestEarned = ((principal*rate)/100)*time;
        float totaladdingIntrest= principal+interestEarned;
        System.out.println("Intrest Earned : "+interestEarned+ " Total amount adding Interest:"+totaladdingIntrest);
    }
}
