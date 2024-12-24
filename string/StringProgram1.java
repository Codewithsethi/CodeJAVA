/*1.WAP to reverse a string.
Input:
this is javatpoint
Output:
tnioptavaj si siht
 */

package string;
import java.util.Scanner;

public class StringProgram1 {

    public static  StringBuilder reverseUsingStringBuilder(String str)
    {
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse();
    }
    public static String reverse(String str)
    {
        if(str.isEmpty())
           return str;
        return reverse(str.substring(1))+str.charAt(0);
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a String:");
        String string=scanner.nextLine();

        System.out.println("1.Using StringBuilder/StringBuffer");
        System.out.println("2.Using Character Array");
        System.out.println("3.Using Recursion");
        System.out.println("Enter Your choice:");
        int i=scanner.nextInt();
        switch(i)
        {
            case 1: StringBuilder reverseString=reverseUsingStringBuilder(string);
                    System.out.println("Given String is: "+string);
                    System.out.println("Reverse of the String is: "+reverseString);
                    break;
            case 2: System.out.println("Given String is: "+string);
                    char[] stringArray=string.toCharArray();
                    int left=0;
                    int right=stringArray.length-1;
                    while(left<right)
                    {
                        char temp=stringArray[left];
                        stringArray[left]=stringArray[right];
                        stringArray[right]=temp;
                        left++;
                        right--;
                    }
                    String reversedString=new String(stringArray);
                    System.out.println("Reversed String is: "+reversedString);
                    break;
            case 3: System.out.println("Given String is: "+string);
                    String reversed=reverse(string);
                    System.out.println("Reversed String is: "+reversed);
                    break;
            default:
                    System.out.println("Please enter a choice...");
        }


       
    }
}
