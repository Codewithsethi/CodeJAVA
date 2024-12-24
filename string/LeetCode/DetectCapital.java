/*
 We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.

 

Example 1:

Input: word = "USA"
Output: true
Example 2:

Input: word = "FlaG"
Output: false
 

Constraints:

1 <= word.length <= 100
word consists of lowercase and uppercase English letters.

 */
package string.LeetCode;

public class DetectCapital {
    
    public static boolean detectCapital(String word)
    {
        if((word.toUpperCase()).equals(word))
        {
            return true;
        }
        if((word.toLowerCase()).equals(word))
        {
            return true;
        }
        if(Character.isUpperCase(word.charAt(0)) &&
         word.substring(1).equals(word.substring(1).toLowerCase()))
         {
            return true;
         }
        return false;
    }

    public static void main(String[] args) {
        
        String S="g";
        System.out.println(detectCapital(S));
    }
}
