

public class FindTheIndexOfTheFirstOccurence {
    
   public static int strStr(String haystack, String needle)
   {
     return haystack.indexOf(needle);
   }

    public static void main(String[] args) {
        
        String haystack="SadButsad";
        String needle="sad";

        System.out.println(strStr(haystack,needle));
    }
}
