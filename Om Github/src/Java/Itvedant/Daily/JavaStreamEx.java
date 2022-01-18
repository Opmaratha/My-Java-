package Java.Itvedant.Daily;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaStreamEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> l = new ArrayList<>();
        l.add(13);
        l.add(5);
        l.add(10);
        l.add(13);
        System.out.println("Enter the value you want to search");
        int a = sc.nextInt();
        System.out.println("find first ");
        Integer ans = l.stream().filter(a1->a1.equals(a)).findFirst().orElse(null);
        System.out.println(ans);
        System.out.println("find any ");
        List<Integer> l2 = l.stream().filter(c->c.equals(a)).collect(Collectors.toList());
        l2.forEach(a1->{
            System.out.println(a);
        });

    }
}
