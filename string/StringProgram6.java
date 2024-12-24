/*6.WAP reverse tOGGLE each word in string.
Input:
this is javatpoint
Output:
sIHT sI tNIOPTAVAJ
 */
package string;

import java.util.Scanner;

public class StringProgram6 {
    
    public static String reverseToggle(String str)
    {
        StringBuilder sb=new StringBuilder(str);
        return new String(new String(sb.reverse()));
    }

    public static String reverseToggleEachWord(String str)
    {
        String reverseStringArray[]=str.split("\\s");
        String returnResult="";
        for(String s:reverseStringArray)
        {  String reverseString=reverseToggle(s);
           String firstLetter=reverseString.substring(0,1);
           String restLetters=reverseString.substring(1);
           returnResult+=firstLetter.toLowerCase()+restLetters.toUpperCase()+" ";
        } 
        return returnResult;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("reverse tOGGLE each word in string.\nInput:");
        String inpuString=sc.nextLine();
        String outputString=reverseToggleEachWord(inpuString);
        System.out.println("Output:"+outputString);
    }

}
