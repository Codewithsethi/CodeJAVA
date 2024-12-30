/*
Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

Note that the strings are case-insensitive, both lowercased and uppercased of the same letter are treated as if they are at the same row.

In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".

 

Example 1:

Input: words = ["Hello","Alaska","Dad","Peace"]

Output: ["Alaska","Dad"]

Explanation:

Both "a" and "A" are in the 2nd row of the American keyboard due to case insensitivity.

Example 2:

Input: words = ["omk"]

Output: []

Example 3:

Input: words = ["adsdf","sfd"]

Output: ["adsdf","sfd"]

 

Constraints:

1 <= words.length <= 20
1 <= words[i].length <= 100
words[i] consists of English letters (both lowercase and uppercase). 
 
 */
import java.util.ArrayList;
import java.util.List;
public class KeyboardRow {
    public static String[] findWords(String[] words) {
        // Create a mapping of each character to its row
        int[] rowMapping = new int[26];
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        for (char c : row1.toCharArray()) rowMapping[c - 'a'] = 1;
        for (char c : row2.toCharArray()) rowMapping[c - 'a'] = 2;
        for (char c : row3.toCharArray()) rowMapping[c - 'a'] = 3;

        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (canBeTyped(word.toLowerCase(), rowMapping)) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

    private static boolean canBeTyped(String word, int[] rowMapping) {
        // Get the row of the first character
        int row = rowMapping[word.charAt(0) - 'a'];

        // Check if all characters belong to the same row
        for (char c : word.toCharArray()) {
            if (rowMapping[c - 'a'] != row) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        String[] result = findWords(words);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
