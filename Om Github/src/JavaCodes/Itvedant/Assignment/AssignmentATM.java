package JavaCodes.Itvedant.Assignment;

import java.util.Scanner;

public class AssignmentATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount You want to withdraw");
        int amount= sc.nextInt();
        int notes;
        if (amount >= 2000) {
            notes=amount/2000;
            System.out.println(notes+" Notes of 2000");
            amount=amount%2000;
        }
        if (amount >= 500) {
            notes=amount/500;
            System.out.println(notes+" Notes of 500");
            amount=amount%500;
        }
        if (amount >= 200) {
            notes=amount/200;
            System.out.println(notes+" Notes of 200");
            amount=amount%200;
        }
        if (amount >= 100) {
            notes=amount/100;
            System.out.println(notes+" Notes of 100");
            amount=amount%100;
        }
    }
}
