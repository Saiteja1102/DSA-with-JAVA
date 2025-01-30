/*
Determine if 2 Strings are anagrams of each other.

What are anagrams?
If two strings contain the same characters but in a different order, they can be said to be
anagrams. Consider race and care. In this case, race's characters can be formed into a study,
or care's characters can be formed into race. Below is a java program to check if two strings
are anagrams or not.
 */

import java.util.*;

public class D15_Question2 {
    public static void main(String[] args){
        String str1 = "race";
        String str2 = "care";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        char[] str1array = str1.toCharArray();
        char[] str2array = str2.toCharArray();
        // sort
        Arrays.sort(str1array);
        Arrays.sort(str2array);

        boolean result = Arrays.equals(str1array, str2array);
        if(result){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
