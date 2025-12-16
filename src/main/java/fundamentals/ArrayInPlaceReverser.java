package fundamentals;
import java.util.Arrays;

/**
 * In-Place Array Reverser
 * * Objective: Reverse the elements of an array without using additional buffer memory
 * (Space Complexity O(1)).
 */
public class ArrayInPlaceReverser {

    static void reverse (int[] numbers) {
        //check if array is null or empty
        if (numbers == null || numbers.length <= 1) {
            return;
        }

        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }
    }

    public static void main (String[] args) {
        int[] numbers = {1,2,3,4,5,6};

        System.out.println("Original: " + Arrays.toString(numbers));
        reverse(numbers);
        System.out.println("Reversed: " + Arrays.toString(numbers));
    }
}

