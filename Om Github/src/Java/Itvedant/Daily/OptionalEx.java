package Java.Itvedant.Daily;

import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        Optional<Integer> optionalInteger= Optional.of(Integer.parseInt("10"));
        if(optionalInteger.isEmpty()) {
            System.out.println("hi");

        }else{
            System.out.println("Hello");
        }

    }

}
