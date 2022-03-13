package JavaCodes.Codes;


import java.util.*;

public class JavaStaticInitializerBlock {
    static Scanner sc = new Scanner(System.in);
    static int Breadth=sc.nextInt();
    static int height=sc.nextInt();
    static boolean flag=true;
    static {
        try {
            if (Breadth <= 0 || height <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        }catch (Exception e){
            System.out.println(e);

        }

    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        if(flag){
            int area=Breadth*height;
            System.out.println(area);
        }

    }
}
