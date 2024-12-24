/*2.WAP to check the string is palindrome or not.
Input:
nitin
Output:
true
 */
package string;

import java.util.Scanner;

public class StringProgram2 {

    public static String reverse(String str)
    {
        StringBuilder string=new StringBuilder(str);
        String reverseString=new String(string.reverse());
        return reverseString;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String to check the String is Palindrome or not: ");
        String string=sc.nextLine();
        String reverseString=reverse(string);
        if(string.equals(reverseString))//if given string and reverse of the string matches returns true
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
