package JavaCodes.Codes;

import java.util.Scanner;

public class PrimeNumberChecker {
    //  what is prime number?
    //  prime number is number which is divisible only by one and itself
    //  my own logic i took my 2 days like i got frustrated for last two days but finally today i did it by my own haha its silly but i m very happy:}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number you want to check weather its a prime  number or not");
        int input = sc.nextInt();
        int count=0;
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                    count++;
                }
             }
        if(count==2){
            System.out.println(input+" number is prime number ");
        }else{
            System.out.println(input+" number is not a prime number ");
        }
        }



    }

