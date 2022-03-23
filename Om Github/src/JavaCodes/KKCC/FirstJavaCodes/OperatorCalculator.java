package JavaCodes.KKCC.FirstJavaCodes;

import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class OperatorCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number:");
        int firstnum = sc.nextInt();
        System.out.println("Input second number:");
        int secondnum = sc.nextInt();
        System.out.println("Input Operator (+,-,*,/)");
        char operator = sc.next().charAt(0);

        if (operator == '+' ){
            System.out.println("Addition of two numbers is "+(firstnum+secondnum));
        }
        else if (operator == '-' ){
            System.out.println("Substraction of two numbers is "+(firstnum-secondnum));
        }
        else if (operator == '*' ){
            System.out.println("Multiplication of two numbers is "+(firstnum*secondnum));
        }
        else if (operator == '/' ){
            System.out.println("Division of two numbers is "+(firstnum/secondnum));
        }
        else {
            System.out.println("Invalid Input insert any one operator from following +,-,*,/");
        }
    }
}
