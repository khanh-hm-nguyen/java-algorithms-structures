package fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * Detects if the provided array contains any duplicate elements.
 *
 * @param numbers The array of integers to inspect.
 * @return true if a duplicate exists, false if all elements are unique.
 */
public class FindDuplicateInArray {

    static boolean hasDuplicate(int[] numbers) {

        if (numbers == null || numbers.length < 1) return false;

        Set<Integer> seenNumbers = new HashSet<>();

        for (int num : numbers) {
            if (!seenNumbers.add(num)) {
                return true;
            }
        }

        return false;
    }

    public static void main (String[] args) {
        int[] data = {1, 2, 3, 1}; // Should return true
        System.out.println("Has duplicate: " + hasDuplicate(data));
    }

}
