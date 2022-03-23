package JavaCodes.KKCC.FirstJavaCodes;

import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers.
//   0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
public class FibonacciSeries {
    public static void main(String[] args) {
        int k=0,a=1,b=1;
        System.out.println("Enter the number till you want to print the Fibonacci Series ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("0 1 1 ");
        while(k<=n){
            k=a+b;
            if (k>n){
                break;
            }
            System.out.print(k+" ");
            a=b;
            b=k;
        }

    }
}