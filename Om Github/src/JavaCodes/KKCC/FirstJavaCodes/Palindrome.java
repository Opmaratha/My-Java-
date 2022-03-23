package JavaCodes.KKCC.FirstJavaCodes;

import java.util.Scanner;

//To find out whether the given String is Palindrome or not.   12321 12321

public class Palindrome {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want to check weather its Palindrome or not");
    int n = sc.nextInt();
    int t = n;
    int r,s=0;
    while (n>0){
        r=n%10;
        n=n/10;
        s=s*10+r;
    }
    if (s==t){
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not Palindrome");
    }
 }
}


/*
// String IS Palindrome or not checker

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String you want to check Palindrome or not");
        String str = sc.next();
        StringBuffer newStr =new StringBuffer();
        for(int i = str.length()-1; i >= 0 ; i--) {
            newStr = newStr.append(str.charAt(i));
        }
        if(str.equalsIgnoreCase(newStr.toString())) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}

*/
