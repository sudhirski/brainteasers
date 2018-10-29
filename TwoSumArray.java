package tasks;

import java.util.Arrays;

/**
 * @author Sudhir Kumar
 *
 * Class to find whether an array has two numbers that add upto a certain sum or not.
 */
public class TwoSumArray {

    private static final int [] array = {8, 2, 3, 10, 4, 2};

    public static void main(String[] args) {

        int twoSum = 12;

        if (hasTwoSum(0, array.length - 1, twoSum)) {

            System.out.println("Array has the desired sum");

        } else {

            System.out.println("Array does not have the desired sum");

        }

    }

    static boolean hasTwoSum(int start, int end, int twoSum) {

        // Start by sorting the array, O(n x log(n))
        Arrays.sort(array);

        // This is O(n)
        while(start < end) {

            int sum = array[start] + array[end];

            if (sum == twoSum) {

                return true;

            } else if (sum > twoSum) {

                // Sum is more than what we're looking for - reduce
                end--;

            } else {

                // Sum is lesser than what we're looking for - increase
                start++;
            }
        }

        return false;
    }
}