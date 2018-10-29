
import com.google.common.base.Strings;

/**
 * @author Sudhir Kumar.
 *
 * Class to recursively reverse a string.
 */
public class RecursiveReverse {

    private final static String toReverse = "ABCDE";

    public static void main(String[] args) {

        System.out.println("Reversed Form of " + toReverse + " is : " + recursiveReverse(toReverse));

    }

    static String recursiveReverse(String str) {

        if (Strings.isNullOrEmpty(str)) {
            return "";
        }

        char thisChar = str.charAt(0); // Isolate the first character
        String remaining = str.substring(1); // The remaining portion of the string except the first character
        
        return recursiveReverse(remaining)  + thisChar;
    }
}
