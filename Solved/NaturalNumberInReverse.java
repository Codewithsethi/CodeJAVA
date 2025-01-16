/*WAP to print n natural numbers in reverse */
public class NaturalNumberInReverse {
    public static void main(String[] args) {
        int n = 10;
        printAllNaturalNumbers(n);
    }
    public static void printAllNaturalNumbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printAllNaturalNumbers(n - 1);
    }
}
