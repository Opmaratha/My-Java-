package Java.Itvedant.Daily;

import java.util.ArrayList;

public class ForeachEx {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(10);
        al.add(11);
        al.forEach(om->{
            System.out.println(om);
        });
    }
}
