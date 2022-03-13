package JavaCodes.Itvedant.Daily;
interface om1{

    void b(int a,int b);
}
public class LamdaEx3 {
    public static void main(String[] args) {


        om1 km = (int x, int y) -> {
            System.out.println(x+y);
        };
        km.b(5,6);
    }
}
