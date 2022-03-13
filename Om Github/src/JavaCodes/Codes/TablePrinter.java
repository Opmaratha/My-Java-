package Codes;

import java.util.Scanner;

public class TablePrinter {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number for you want to print a table");
            int input = sc.nextInt();
            sc.close();
            for(int i = 1;i<=10;i++){
                System.out.println(input+" x "+i+" = "+input*i);
            }
        }
    }

