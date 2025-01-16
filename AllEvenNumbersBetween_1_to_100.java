/*WAP to print all even numbers between 1 to 100 */
public class AllEvenNumbersBetween_1_to_100 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
