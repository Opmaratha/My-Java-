package JavaCodes.Codes;



// Java program to illustrate
// Converting a String to a List
// of Characters
import java.util.*;

// Java program to convert
// a String to a List of Characters

public class Wiprocode {

    // Function to convert String
    // to List of Characters
    public static List<Character>
    convertStringToCharList(String str) {

        // Create an empty List of character
        List<Character> chars = new ArrayList<>();

        // For each character in the String
        // add it to the List
        for (char ch : str.toCharArray()) {

            chars.add(ch);
        }

        // return the List
        return chars;
    }

    // Driver code
    public static void main(String[] args) {

        // Get the String to be converted
        String str = "aAkliP";

        // Get the List of Character
        List<Character>
                chars = convertStringToCharList(str);

        // Print the list of characters
//        System.out.println(chars);
        // Finding the size of ArrayList

        int n = chars.size();

// printing the ArrayList elements

//        System.out.println("ArrayList elements are :");
//
//        for (int i = 0; i < n; i++) {
//
//            System.out.println(chars.get(i) + " ");
//
//        }

//        System.out.println();

// Finding the minimum and maximum from the

// arraylist using min and max method of collection

// class

        int max = Collections.max(chars);

//        System.out.println("Maximum is : " + max);

        int min = Collections.min(chars);

//        System.out.println("Minimum is : " + min);
        System.out.println(max+min);

    }
}
//        //numbers array
//        int[] Character = chars.toArray(new int[0]);
//        int numbers[] = new int[]{55,32,45,98,82,11,9,39,50};
//
//        //assign first element of an array to largest and smallest
//        int smallest = numbers[0];
//        int largetst = numbers[0];
//
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] > largetst)
//                largetst = numbers[i];
//            else if (numbers[i] < smallest)
//                smallest = numbers[i];
//        }
//
//        System.out.println("Largest Number is : " + largetst);
//        System.out.println("Smallest Number is : " + smallest);
//    }
//}
//        String str = "aAkliP";
//        for(int i=0; i<str.length(); i++)
//        {
//            int asciiValue = str.charAt(i);
//            System.out.println(str.charAt(i) + "=" + asciiValue);
//        }



