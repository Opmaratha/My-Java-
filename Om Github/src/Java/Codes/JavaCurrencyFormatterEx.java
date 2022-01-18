package Java.Codes;

import java.util.*;
import java.text.*;


    public class JavaCurrencyFormatterEx {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double payment = scanner.nextDouble();
            scanner.close();

            // Write your code here.
            Locale indiaLocale =new Locale("en","IN");
            NumberFormat us =  NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
            NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            String u =us.format(payment).toString();
            String i =india.format(payment).toString();
            String c =china.format(payment).toString();
            String f =france.format(payment).toString();

            System.out.println("US: " + u);
            System.out.println("India: " + i);
            System.out.println("China: " + c);
            System.out.println("France: " + f);


            //second way


            /* NumberFormat objus = NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat objin = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
            NumberFormat objcn = NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat objfr = NumberFormat.getCurrencyInstance(Locale.FRANCE);

            String us = objus.format(payment);
            String in = objin.format(payment);
            String cn = objcn.format(payment);
            String fr = objfr.format(payment);

            System.out.println("US: " + us);
            System.out.println("India: " + in);
            System.out.println("China: " + cn);
            System.out.println("France: " + fr); */
        }
    }

