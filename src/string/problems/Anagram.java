package string.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        System.out.println("Please Enter Any Words below :-");
        Scanner stdin=new Scanner(System.in);
        String  inputString1=stdin.next();
        String  inputString2=stdin.next();
   System.out.print(isAnagram(inputString1,inputString2));
    }
    public static boolean isAnagram(String string1 , String string2)
    {
        // check if the two strings are equal
        // then they cannot be anagrams
        if ( string1.length() != string2.length() ) {
            return false;
        }
        string1=string1.toLowerCase();
        string2=string2.toLowerCase();
        char[] c1 = string1.toCharArray();
        char[] c2 = string2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String sc1 = new String(c1);
        String sc2 = new String(c2);
        return sc1.equals(sc2);
    }
}
