package JavaCodes.Codes;
//A
//
//CB
//
//DEF
//
//JIHG
//
//KLMNO

//remaining to do later

import java.util.ArrayList;

public class CharacterPritingProgram {
    public static void main(String[] args) {
        char ch = 'A';

        for (int i = 0; i < 5; i++) {
            if (i == 2 || i == 4) {
                for (int j = 0; j <= i; j++) {
                    ch++;
                    ArrayList<Character> reverse =new ArrayList<Character>();
                    reverse.add(ch);
                    for (int k = reverse.size(); k > 0 ; k--) {
                        System.out.println(reverse.get(k));
                    }
                }

            }else {
                for (int j = 0; j <= i; j++) {
                    System.out.print(ch++);
                }
            }
            System.out.println();
        }
    }
}

