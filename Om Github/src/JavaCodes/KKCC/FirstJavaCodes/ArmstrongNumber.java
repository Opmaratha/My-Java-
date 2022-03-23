package JavaCodes.KKCC.FirstJavaCodes;

import java.util.Scanner;

//To find Armstrong Number between two given number.
// A positive number is called armstrong number if it
// is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check:");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int i = 2;
        while (i > 0) {
            int t = input1;
            int ans = 0;
            System.out.print("Addition of " + t + " individual number cubes i.e ");
            while (input1 > 0) {
                int a = input1 % 10;
                int b = input1 / 10;
                int c = a * a * a;
                System.out.print(c + " ");
                input1 = b;
                ans = ans + c;

            }
            if (t == ans) {
                System.out.println("equals " + t + " thus its Armstrong Number.");
            } else {
                System.out.println("not equals " + t + " thus its not a Armstrong Number.");
            }
            input1=input2;
            i--;
        }
    }
}




