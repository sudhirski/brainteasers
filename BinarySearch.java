/**
 * Class for demonstrating binary search in an iterative and recursive manner.
 * @author sudhirski 
 */
public class BinarySearch {

    private static int array[] = {2, 5, 6, 8, 10, 12, 15, 1823};

    public static void main(String[] args) {

        int key = 12;
        int returnVal = binSearchIterative(key);
        if (returnVal != -1) {
            System.out.println("Key found at location " + returnVal);
        } else {
            System.out.println("Key not found");
        }

        returnVal = binSearchRecursive(0, array.length - 1, key);
        if (returnVal != -1) {
            System.out.println("Key found at location " + returnVal);
        } else {
            System.out.println("Key not found");
        }
    }
    static int binSearchIterative(int key) {

        int start = 0, end = array.length - 1, mid;

        while (start <= end) {

            mid = start + ((end - start)/2);
            if (array[mid] == key) {

                return mid;
            } else if (array[mid] < key) {

                start = mid + 1;
            } else {

                end = mid - 1;
            }
        }
        return -1;
    }

    static int binSearchRecursive(int start, int end, int key) {

        if (start > end) {
            return -1;
        }
        int mid = start + ((end - start) / 2);
        if (array[mid] == key) {

            return mid;
        } else if (array[mid] < key) {

            start = mid + 1;

            return binSearchRecursive(start, end, key);
        } else {

            end = mid - 1;

            return binSearchRecursive(start, end, key);
        }
    }
}
