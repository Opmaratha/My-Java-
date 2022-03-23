package JavaCodes.KKCC.FirstJavaCodes;

import java.util.Scanner;

//Input currency in rupees and output in USD.
public class Inr_to_usd {
    public static void main(String[] args) {
        //Assuming current dollar rates i.e 1 USD = 76.16 Rupees
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter money in rupees");
        float rupees= sc.nextInt();
        float usd = (float) (rupees/76.16);
        System.out.println( rupees+" Rupees are equal to  "+usd+" USD");
    }
}
