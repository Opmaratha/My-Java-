package Java.Itvedant.Assignment;

public class PatternsEx {
    static void pattern1() {
        char a='A';
        for(int i=1;i<=5;i++) {
            for(int j=1;j<i;j++) {
                System.out.print(a+" ");
            }
            System.out.println(a++);
        }
    }
    static void pattern2(){
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >=i ; j--) {
                System.out.print(j+" ");

            }
            System.out.println();

        }
    }
    static void pattern3() {
        for(int i=1;i<=5;i++) {
            for(int j=4;j>=i;j--) {
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++) {
                System.out.print(k+" ");
            }
            for(int p=i-1;p>=1;p--) {
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern3();
    }
}
