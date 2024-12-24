/*Reverse words in a given string
Given a string, the task is to reverse the order of the words in the given string. 
Examples:
Input: s = “geeks quiz practice code” 
Output: s = “code practice quiz geeks”
Input: s = “i love programming very much” 
Output: s = “much very programming love i”
 */
package string;

import java.util.Scanner;

public class StringProgram7 {
    
    public static String reverseOrderString(String str)
    {
        String stringToArray[]=str.split("\\s");
        int left=0;
        int right=stringToArray.length-1;
        while(left<right)
        {
            String temp=stringToArray[left];
            stringToArray[left]=stringToArray[right];
            stringToArray[right]=temp;
            left++;
            right--;
        }
        return String.join(" ", stringToArray);/*String.join() method in Java is used to join multiple strings together into a single string*/
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("To reverse the order of the words in the given string\nInput:");
        String inputString=sc.nextLine();
        String outputString=reverseOrderString(inputString);
        System.out.print("Output:"+outputString);
    }
}
