package Java.Codes;

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;
        import java.lang.reflect.*;
import static java.lang.System.in;
class Prime{
    void checkPrime(Integer... InputStreamReader) {
        ArrayList<Integer> input = null;
        ArrayList<Integer>printprime= null;
        for (Integer br : InputStreamReader) {
            input = new ArrayList<>();
            input.add(br);
        }
        for (int primeno : input) {
            int count = 0;
            for (int i = 1; i <= primeno; i++) {
                if (primeno % i == 0) {
                    count++;
                }else{
                    for( Integer print : printprime ){
                        System.out.println(print);
                    }
                }
            }
            if (count == 2) {

                printprime=new ArrayList<>();
                printprime.add(primeno);
                for( Integer print : printprime ){
                    System.out.println(print);
                }

            }
        }
        System.out.println();
    }
    }
    /* public  void checkPrime(int n1,int n2,int n3,int n4,int n5){
        ArrayList<Integer>input=new ArrayList<>();
        input.add(n1);
        input.add(n2);
        input.add(n3);
        input.add(n5);
        input.add(n5);
        for (int primeno:input) {
            int count=0;
            for (int i = 1; i <= primeno; i++) {
                if (primeno % i == 0) {
                    count++;
                }
            }
            if(count==2){
                System.out.print(primeno);
            }
            }
            System.out.print(" ");
        }
*/


public class PrimeCheckerhr {

    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            Prime ob=new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1,n2);
            ob.checkPrime(n1,n2,n3);
            ob.checkPrime(n1,n2,n3,n4,n5);
            Method[] methods=Prime.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}

