
// 1  Write a program to generate the pattern
//A
//
//CB
//
//DEF
//
//JIHG
//
//KLMNO


// 2  Write a program to display the vowels which are present in given string
//e.g.  the string is: I love my India.
//
//Expected Output: I o e a

// 3  Write a program to sort the list of employees

//4   Write a program to establish database connectivity and perform the update operation using dynamic query.

package JavaCodes.Codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class JavaTestPrograms {

    public static void main(String[] args) {

        List<String> employees = new ArrayList<>();

        employees.add("suraj");
        employees.add("ishwar");
        employees.add("ulan");
        employees.add("umang");
        employees.add("ashish");

        System.out.println("List of employees before sorting : ");

        Iterator<String> it = employees.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        Collections.sort(employees);

        System.out.println("List of employees after sorting :");

        it = employees.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}