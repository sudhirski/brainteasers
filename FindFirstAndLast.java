public class FindFirstAndLast {

    static int [] array = {1,2,3,3,3,4,5,6};

    public static void main(String[] args) {

        int s = binSearch(3, 0, array.length - 1, true);
        int e = binSearch(3, 0, array.length - 1, false);

        if (s != -1 && e != -1) {
            System.out.println("First pos: " +s + " Last pos: " + e);
        }
    }

    static int binSearch(int key, int start, int end, boolean isFirst) {

        int result = -1;


        while (start <= end) {

            int mid = start + ((end - start) / 2);

            if (array[mid] == key) {
                result = mid;
                if (isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (array[mid] > key) {
                end  = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }
}
