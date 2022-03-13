package JavaCodes.Codes;

import java.util.Scanner;

public class EOF {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int i = 1;
        String a;
        for(i=1;sc.hasNext();i++){
            a=sc.nextLine();
            System.out.println(i+ " " + a);
        }
        // int i = 1;
        // String a;
        // while(sc.hasNext()){
        //     a = sc.nextLine();
        //     System.out.println( i + " " + a);
        //     i++;
        // }
    }
}


