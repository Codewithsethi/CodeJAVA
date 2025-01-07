/*
 Given a string str, the task is to reverse the order of the words in the given string. Note that str may contain leading or trailing dots(.) or multiple trailing dots(.) between two words. The returned string should only have a single dot(.) separating the words.

Examples:

Input: str = “i.like.this.program.very.much” 
Output: str = “much.very.program.this.like.i” 


Input: str = ”..geeks..for.geeks.” 
Output: str = “geeks.for.geeks”
 */
package string.GFG.Level1;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsInAGivenString {
    public static String reverseWords(String s) {
        return Arrays.stream(s.split("\\."))
                     .filter(word -> !word.isEmpty())  // Remove empty strings
                     .collect(Collectors.toList())
                     .stream()
                     .collect(Collectors.joining(".")); // Join with "."
    }

    public static void main(String[] args) {
        String s = "..geeks..for.geeks.";
        System.out.println(reverseWords(s));
    }
}
