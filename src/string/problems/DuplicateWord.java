package string.problems;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mrahman on 4/9/16.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        String test = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        Set<String> duplicates = duplicateWords(test);
        System.out.println("input : " + test);
        System.out.println("output : " + duplicates);
    }


    /**
     * Method to find duplicate words in a Sentence or String
     * @param input String
     * @return set of duplicate words
     */
    public static Set<String> duplicateWords(String input){
        int count=0;
        if(input == null || input.isEmpty()){
            return Collections.emptySet();
        }
        Set<String> duplicates = new HashSet<>();

        String[] words = input.split("\\s+");
        Set<String> set = new HashSet<>();

        for(String word : words){
            if(!set.add(word)){
                duplicates.add(word);
                count=(word.length())+1;

            }
        }
        return duplicates;
      //  return count;
    }
  //  public static int count(String s, String pattern) {

      //  String sTemp = test;
        int counter = 0;

     //   while (sTemp.length() > 0) {
         //   int index = sTemp.indexOf(pattern);
          //  if (index == -1) break;
           // sTemp = sTemp.substring(index + pattern.length(), sTemp.length());
          //  counter++;
      //  }
      //  return counter;
  //  }

}
