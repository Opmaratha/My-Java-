package JavaCodes.Codes;
import java.util.*;
public class IntToStringJava {


        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            String s=Integer.toString(n);
            if(s.getClass().getName().equals("java.lang.String")){
                System.out.println("Good job");
            }else{
                System.out.println("Wrong input");
            }

        }
    }

