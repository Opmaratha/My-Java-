package JavaCodes.W3Practise;

import java.util.Scanner;

/*12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers*/
public class A12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = sc.nextInt();
        System.out.println("Enter second number");
        int number2 = sc.nextInt();
        System.out.println("Enter third number");
        int number3 = sc.nextInt();
        double avg = (number1+number2+number3)/3;
        System.out.println(avg);

    }
}
