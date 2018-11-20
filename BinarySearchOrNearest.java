/**
 * Class for demonstrating binary search. Will return the key or its nearest value.
 *
 * @author sudhirski
 */
public class BinarySearchOrNearest {

    private static int array[] = {2, 5, 6, 8, 10, 12, 15, 1823};

    public static void main(String[] args) {

        int key = 8;
        int returnVal = binSearchOrNearestIterative(key);

        System.out.println("Key or nearest value found is " + returnVal);
    }

    static int binSearchOrNearestIterative(int key) {

        int start = 0, end = array.length - 1, mid;

        int nearest = Integer.MAX_VALUE;

        while (start <= end) {

            mid = start + ((end - start)/2);
            if (array[mid] == key) {

                return array[mid];
            } else if (array[mid] < key) {

                start = mid + 1;
            } else {

                end = mid - 1;
            }
            if (Math.abs(nearest - key) > Math.abs(array[mid] - key)) {
                nearest = array[mid];
            }
        }
        return nearest;
    }
}
