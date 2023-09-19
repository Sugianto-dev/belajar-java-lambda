package programmer.zaman.now.lambda.util;

// MATERI METHOD REFERENCE
public class StringUtil {

    // Static Method
    public static boolean isLowerCase(String value) {
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }

}
