/*
 Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:

Input: columnTitle = "A"
Output: 1
Example 2:

Input: columnTitle = "AB"
Output: 28
Example 3:

Input: columnTitle = "ZY"
Output: 701
 

Constraints:

1 <= columnTitle.length <= 7
columnTitle consists only of uppercase English letters.
columnTitle is in the range ["A", "FXSHRXW"].
 */
package string.LeetCode;

class ExcelSheetColumnNumber {

    public static int titleToNumber(String columnTitle) { //"ZY"
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++)//z//y
         {
            int num = columnTitle.charAt(i) - 'A' + 1;//90-65+1=26//89-65+1=25
            result = result * 26 + num;//0*26+26=26//26*26+25=701
        }
        return result;
    }

    public static void main(String[] args) {
        String columnTitle = "ZY";
        System.out.println(titleToNumber(columnTitle));
    }

}