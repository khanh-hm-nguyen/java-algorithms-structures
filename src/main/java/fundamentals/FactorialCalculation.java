package fundamentals;

/**
 * Calculates the factorial of a non-negative integer.
 * <p>
 * The factorial of n (denoted n!) is the product of all positive integers
 * less than or equal to n.
 * Example: 5! = 5 * 4 * 3 * 2 * 1 = 120.
 * </p>
 *
 * @param n The number to calculate the factorial of.
 * @return The factorial of n.
 * @implNote Can be implemented iteratively or recursively.
 */
public class FactorialCalculation {

    static long calculate(int num) {

        long total = 1;
        while (num > 0) {
            total = total * num;
            num--;
        }

        return total;
    }

    public static void main (String[] args) {
        int num = 5;

        System.out.println(calculate(num));
    }
}
