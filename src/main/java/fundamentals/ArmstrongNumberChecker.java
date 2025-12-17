package fundamentals;

/**
 * Checks if a number is an Armstrong number.
 * <p>
 * An Armstrong number is a number that is the sum of its own digits each
 * raised to the power of the number of digits.
 * </p>
 *
 * @param number The number to check.
 * @return true if it is an Armstrong number.
 */
public class ArmstrongNumberChecker {

//    public static boolean isArmstrong (int number) {
//
//        int[] digits = intToArr(number);
//
//        int pow = digits.length;
//        int result = 0;
//
//        for (int digit: digits) {
//            result = result + (int) Math.pow(digit, pow);
//
//        }
//
//        return number == result;
//    }


    // alternative approach
    // Space Complexity: O(1) (No strings or arrays used)
    public static boolean isArmstrong(int number) {

        if (number < 0) return false;

        int numberOfDigits = countDigits(number);

        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int lastDigit = temp % 10;

            sum += (int) Math.pow(lastDigit, numberOfDigits);
            temp = temp / 10;
        }

        return sum == number;
    }

    private static int countDigits(int n) {
        if (n == 0) return 1;

        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main (String[] args) {
        int numbers = 153;

        System.out.println(isArmstrong(numbers));
    }
}
