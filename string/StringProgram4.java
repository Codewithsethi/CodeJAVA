/*4.WAP to reverse each word in string.
Input:
this is javatpoint
Output:
siht si tnioptavaj
 */
package string;

import java.util.Scanner;

public class StringProgram4 {
    
    public static String reverseWord(String str)
    {
        StringBuilder string=new StringBuilder(str);
        String stringStr=new String(string.reverse());
        return new String(stringStr);
    }

    public static void main(String[] args) {
     
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String, to reverse each word in string: ");
        String string=scan.nextLine();
        String str[]=string.split("\\s");
        String reverseWordString="";
        for(String s:str)
        {
            String st=reverseWord(s);
            reverseWordString+=st+" ";
        }
        System.out.println("Output:\n"+reverseWordString.trim());
    }
}
