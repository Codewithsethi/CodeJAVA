/*5. WAP to tOGGLE each word in string.
Input:
this is javatpoint
Output:
tHIS iS jAVATPOINT
 */
package string;

import java.util.Scanner;

public class StringProgram5 {
    public static String toggleEachWord(String str)
    {
        String[] stringArray=str.split("\\s");
        String returnString="";
        for(String s:stringArray)
        {
            String firstLetter=s.substring(0,1);
            String restLetters=s.substring(1);
            returnString+=firstLetter.toLowerCase()+restLetters.toUpperCase()+" ";
        }

        return returnString;
    }

    public static void main( String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("To tOGGLE each word in string \nInput:");
        String stringInput=scan.nextLine();
        String stringOutput=toggleEachWord(stringInput);
        System.out.print("Output:"+stringOutput);
    }
}
