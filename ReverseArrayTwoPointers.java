
import java.util.Arrays;

/**
 * @author Sudhir Kumar
 *
 * Class to demonstrate reversing an array using two poiters - :start: and :end:.
 */
public class ReverseArrayTwoPointers {

    private final static int [] array = {1,2,3,4,5};

    public static void main(String[] args) {

        reverse(array);

        Arrays.stream(array).forEach(
                System.out::print
        );

    }

    static void reverse(int [] array) {

        int start = 0;
        int end = array.length - 1;

        while (start < end) {

            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }
}
