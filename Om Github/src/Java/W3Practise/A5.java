package Java.W3Practise;

import java.util.Scanner;

/*5. Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125*/
public class A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first input number");
        int a = sc.nextInt();
        System.out.println("Enter Second input number");
        int b = sc.nextInt();
        System.out.println(a*b);
    }
}
