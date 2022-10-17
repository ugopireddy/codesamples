import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SmallestNonConstructibleValue {
    public static void main(String[] args) {
        ArrayList<Integer> list = (ArrayList<Integer>) Arrays.asList(12, 2,1, 15, 2, 4);

        smallestNonconstructibleValue(list);
    }

    private static int smallestNonconstructibleValue(ArrayList<Integer> list) {
        Collections.sort(list);

        int maxConstructibleValue =0;
        for (int a : list){
            if( a > maxConstructibleValue) {
                break;
            }
            maxConstructibleValue += a;
        }
        return maxConstructibleValue;
    }
}
