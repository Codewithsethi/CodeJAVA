/*Write to print all natural numbers from 1 to n */
public class AllNaturalNumbersFrom1toN {

    public static void main(String[] args) {
        int n = 10;
        printAllNaturalNumbers(n);
    }

    private static void printAllNaturalNumbers(int n) {
        if (n == 0) {
            return;
        }
        printAllNaturalNumbers(n - 1);
        System.out.println(n);
    }
}