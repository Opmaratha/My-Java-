package JavaCodes.Codes;



import java.util.*;

public class LargestNumberPossible {

    static Integer[] resultsingle = null;
    static Integer[] resultdouble = null;
    static Integer[] resulttriple = null;
    static int count;


    public static Integer[]  seperateSingleDigitNumber(Integer[] givenArray) {
        for (int i = 0; i < givenArray.length; i++) {

            if (givenArray[i] < 10) {
                count++;

                // insert into output array?
                Integer[] resultsingle = new Integer[count];

            }
        }
        return resultsingle;
    }


    public static Integer[]  seperateDoubleDigitNumber(Integer[] givenArray) {
        for (int i = 0; i < givenArray.length; i++) {

            if (givenArray[i] < 10) {
                count++;

                // insert into output array?
                Integer[] resultdouble = new Integer[count];

            }
        }
        return resultdouble;
    }



    public static Integer[]  seperateTripleDigitNumber(Integer[] givenArray) {
        for (int i = 0; i < givenArray.length; i++) {

            if (givenArray[i] < 10) {
                count++;

                // insert into output array?
                Integer[] resulttriple = new Integer[count];

            }
        }
        return resulttriple;
    }


    public static void main(String[] args) {

        Integer[] givenArray = { 30, 34, 5, 3, 9};

        seperateSingleDigitNumber(givenArray);
        Arrays.sort(resultsingle, Collections.reverseOrder());
        String singleDigitOutput=Arrays.toString(resultsingle);

        seperateDoubleDigitNumber(givenArray);
        Arrays.sort(resultdouble, Collections.reverseOrder());
        String doubleDigitOutput=Arrays.toString(resultdouble);

        seperateTripleDigitNumber(givenArray);
        Arrays.sort(resulttriple, Collections.reverseOrder());
        String tripleDigitOutput=Arrays.toString(resulttriple);


        // Printing the elements
        System.out.println(singleDigitOutput+doubleDigitOutput+tripleDigitOutput);

    }
}





