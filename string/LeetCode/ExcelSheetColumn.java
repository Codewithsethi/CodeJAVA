/*
 Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

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

Input: columnNumber = 1
Output: "A"
Example 2:

Input: columnNumber = 28
Output: "AB"
Example 3:

Input: columnNumber = 701
Output: "ZY"
 

Constraints:

1 <= columnNumber <= 231 - 1
 */
package string.LeetCode;

public class ExcelSheetColumn {
    
    public static String convertToTitle(int columnNumber) {
        
        /*if(columnNumber<=26)
        {
            columnNumber--;
            char ch=(char)('A'+columnNumber);
            return String.valueOf(ch);
        }
        else
        {
            int num1= columnNumber/26;
            num1--;
            char ch=(char)('A'+num1);
            String str1=String.valueOf(ch);

            int num2= columnNumber%26;
            num2--;
            char ch1=(char)('A'+num2);
            String str2=String.valueOf(ch1);
            

            return str1+str2;
        }*/
        StringBuilder result=new StringBuilder();
        while (columnNumber>0) {//28,1
            
            columnNumber--;//27,0
            int remainder=columnNumber%26;//1,0
            char ch=(char)('A'+remainder);//65+1=66 'B',65+0=65 'A'
            result.append(ch);//"B""A"="BA"
            columnNumber=columnNumber/26;//1
        }
        return result.reverse().toString();
    }


    public static void main(String[] args) {
        
        System.out.println(convertToTitle(701));
    }
}
