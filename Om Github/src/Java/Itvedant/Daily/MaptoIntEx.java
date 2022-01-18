package Java.Itvedant.Daily;

import java.util.ArrayList;
import java.util.List;

public class MaptoIntEx {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(13);
        l.add(5);
        l.add(10);
        Integer m=l.stream().mapToInt(v->v).min().getAsInt();
        System.out.println(m);
    }
}
