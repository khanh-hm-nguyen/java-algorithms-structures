package fundamentals;


/**
 * Returns the n-th number in the Fibonacci sequence.
 * <p>
 * The sequence starts: 0, 1, 1, 2, 3, 5, 8...
 * Formula: F(n) = F(n-1) + F(n-2).
 * </p>
 *
 * @return The Fibonacci number at position n.
 */
public class FibonacciSequence {

    static long numFibonacci (int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Position must be non-negative");
        }

        if (n == 0 || n == 1) return n;

        long a = 0;
        long b = 1;
        long current = 0;

        for (int i = 2; i <= n; i++) {
            current = a + b;
            a = b;
            b = current;
        }

        return current;

    }

    public static void main (String[] args) {
        int position = 13;
        System.out.println("Fibonacci at position " + position + " is: " + numFibonacci(position));
    }
}
