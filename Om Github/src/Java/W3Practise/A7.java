package Java.W3Practise;

import java.util.Scanner;

/*7. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80*/
public class A7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert input number you want to print table of");
        int a = sc.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(a + "*" +i+"="+a*i);
        }
    }
}
