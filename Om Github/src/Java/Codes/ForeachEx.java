package Java.Codes;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForeachEx {
    public static void main(String[] args) {
        int[] rollno={1,2,3,4};
        String [] name={"om","mandar","anuu","Sandesh"};
        for (String STudentnames:name
             ) {
            System.out.println(name);
        }
        for (int Studentrollno:rollno
             ) {
            System.out.println(Studentrollno);
        }
        ArrayList<Integer> Rankers = new ArrayList<>(4);
        Rankers.add(1);
        Rankers.add(2);
        Rankers.add(3);
        for(int Toppers:Rankers){
            System.out.println(Toppers);
        }

        //LinkedList<Integer>   do try every type of lists tomorrow and start apa clg and hacker rank too
    }



}
