/*3.WAP to capitalize each word in string.
Input:
this is javatpoint
Output:
This Is Javatpoint
 */
package string;

import java.util.Scanner;

public class StringProgram3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String, to capitalize each word in the string: ");
        String string=sc.nextLine();
        String str[]=string.split("\\s");/*the split() method in the String class is used to split a string into an array of 
                                                substrings based on a specified delimiter. */
        String capitalizeWord="";
        for(String s:str)
        {
          String first=s.substring(0,1);
          String rest=s.substring(1);
          capitalizeWord+=first.toUpperCase()+rest+" ";
        }
        System.out.println("Output is:\n"+capitalizeWord);
    }
}
