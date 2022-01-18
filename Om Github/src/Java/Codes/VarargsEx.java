package Java.Codes;


import java.io.*;
        import java.util.*;

class add{
    public static void sum(int input1, int input2, int input3, int input4, int input5, int input6){

        System.out.println(input1+"+"+input2+"="+(input1+input2));
        System.out.println(input1+"+"+input2+"+"+input3+"="+(input1+input2+input3));
        System.out.println(input1+"+"+input2+"+"+input3+"+"+input4+"+"+input5+"="+(input1+input2+input3+input4+input5));
        System.out.println(input1+"+"+input2+"+"+input3+"+"+input4+"+"+input5+"+"+input6+"="+(input1+input2+input3+input4+input5+input6));

    }
}


public class VarargsEx extends add{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int input4 = sc.nextInt();
        int input5 = sc.nextInt();
        int input6 = sc.nextInt();
        add.sum(input1,input2,input3,input4,input5,input6);
    }
}
