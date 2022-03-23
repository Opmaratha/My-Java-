package JavaCodes.KKCC.FirstJavaCodes;

import java.util.Scanner;

//Write a program to print whether a number is even or odd, also take input from the user.
public class Evenodd_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thr number to check weather the number is een or odd");
        int input=sc.nextInt();
        if(input%2==0){
            System.out.println("Even number");
        }else {
            System.out.println("Odd number");
        }
    }
}
