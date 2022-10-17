import java.util.ArrayList;
import java.util.List;

public class RotateString {
    public static void main(String[] args) {
        System.out.println("Rotate String : " + rotateString("abcd", "bcda"));
    }

    private static boolean rotateString(String A, String B) {
        if(A.length() != B.length()) return false;
        if ((A+A).contains(B) ) return true;
        return false;
    }
}
