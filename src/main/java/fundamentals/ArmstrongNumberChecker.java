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

    public static boolean isAmstrong (int number) {

        int[] digits = intToArr(number);

        int pow = digits.length;
        int result = 0;

        for (int digit: digits) {
            result = result + (int) Math.pow(digit, pow);

        }

        return number == result;
    }

    static int[] intToArr (int numbers) {
        String temp = String.valueOf(numbers);
        int[] digits = new int[temp.length()];

        for (int i =0; i < temp.length(); i++) {
            digits[i] = Character.getNumericValue(temp.charAt(i));
        }
        return digits;
    }

    public static void main (String[] args) {
        int numbers = 153;

        System.out.println(isAmstrong(numbers));
    }
}
