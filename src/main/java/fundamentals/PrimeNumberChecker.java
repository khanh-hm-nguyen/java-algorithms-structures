package fundamentals;

/**
 * Checks if a given integer is a prime number.
 * <p>
 * A prime number is a number greater than 1 that has no positive divisors
 * other than 1 and itself.
 * </p>
 *
 * @param number The integer to check.
 * @return true if the number is prime, false otherwise.
 * @throws IllegalArgumentException if the number is negative.
 */
public class PrimeNumberChecker {

    static boolean primeChecker(int num) {

        // check if num is in prime range
        if (num < 2) {
            return false;
        }

        if (num == 2 || num == 3) {
            return true;
        }

        // check if num is even number
        if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i < Math.sqrt(num); i+=2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main (String[] args) {
        int[] primelist = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

        for (int i = 0; i < primelist.length; i++) {
            String isPrime = primeChecker(primelist[i]) ? "is Prime Number" :  "is not Prime Number";
            System.out.println("This number " + primelist[i] + " " + isPrime);
        }
    }
}
