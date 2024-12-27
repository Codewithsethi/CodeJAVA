/*
 Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.
Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
 

Constraints:

1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters
 */

//import java.util.HashMap;
//import java.util.Map;

public class RansomNote {
   /*public static boolean canConstruct(String ransomNote, String magazine) {
       // Create a frequency map for the magazine
        Map<Character, Integer> magazineMap = new HashMap<>();
        
        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }
        
        // Check if ransomNote can be constructed
        for (char c : ransomNote.toCharArray()) {
            if (!magazineMap.containsKey(c) || magazineMap.get(c) <= 0) {
                return false;
            }
            magazineMap.put(c, magazineMap.get(c) - 1);
        }
        
        return true;
    }*/
    public static boolean canConstruct(String ransomNote,String magazine)
    {
        int[] charCount = new int[26];

        for(char c : magazine.toCharArray())
        {
            charCount[c - 'a']++;
        }

        for(char c: ransomNote.toCharArray())
        {
            charCount[c - 'a']--;

            if(charCount[c - 'a'] <0)
            {
                return false;
            }
                    
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}
