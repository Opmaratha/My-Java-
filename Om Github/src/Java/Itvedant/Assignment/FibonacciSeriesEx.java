package Java.Itvedant.Assignment;

import java.util.Scanner;

public class FibonacciSeriesEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till you want to find Fibonacci series");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        for (int c = 0; c < num; c=a+b) {
        a=b;
        b=c;
            System.out.print(c+" ");
        }
    }
}
